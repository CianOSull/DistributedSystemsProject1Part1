package main;

import Observer.fileObservable;
import Observer.fileObserver;

public class heroMain {
    public static void main(String [] args) {
        fileObservable fileOberv = new fileObservable();
        fileObserver fileOb = new fileObserver();
        // Add observer to the class
        fileOberv.addObserver(fileOb);
        // This watch service will now watch the file area for changes
        //fileOberv.watchDirectory();
        fileOb.update(true);
    }
}

/*
        fileObservable fileObserv = new fileObservable();
        fileObserver fileOb = new fileObserver();

        fileObserv.addObserver(fileOb);

        for(int i = 0; i < 1; i++){
            fileObserv.watchDirectory();
        }

        String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battleZones/battle.txt";
        heroObserver heroObserv = new heroObserver();

        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(heroObserv);

            System.out.println("A Hero observer has been serailized");

            out.close();
            file.close();
        }
        catch (Exception e) {
            // printStackTrace method
            e.printStackTrace();
            // Prints what exception has been thrown
            System.out.println(e);
        }

         */