package Observer;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class fileObservable implements Observable {
    private fileObserver fileOb;
    private File battleFile = new File("/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
            "/DistributedSystemsProject1/src/battleZones/battle.txt");

    public void addObserver(fileObserver observer) {
        this.fileOb = observer;
        fileOb.check();
    }

    private void notifyObservs(boolean makeHero) {
        fileOb.update(makeHero);
    }

    public void watchDirectory() {
        // This watch directory will only be called once so it is fine for the start up
        boolean noVillain = true;
        //checkForFile();
        try {
            // This part here creates the watch service and connects it to the file system
            WatchService watchService = FileSystems.getDefault().newWatchService();

            // This gets the path to the directory being monitored
            Path path = Paths.get("/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                    "/DistributedSystemsProject1/src/battleZones");

            path.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            WatchKey key;
            while ((key = watchService.take()) != null) {
                for (WatchEvent<?> event : key.pollEvents()) {
                    //process
                    System.out.println("Event kind:" + event.kind() + ". File affected: " + event.context() + ".");
                    if(event.kind() == StandardWatchEventKinds.ENTRY_MODIFY && noVillain){
                        // False so it makes a villain
                        notifyObservs(false);
                        noVillain = false;
                        //break;
                    }
                    else if(event.kind() == StandardWatchEventKinds.ENTRY_MODIFY && !noVillain){
                        // True so it makes a hero
                        notifyObservs(true);
                        noVillain = true;
                        //break;
                    }
                    break;
                }
                key.reset();
            }
        }
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}