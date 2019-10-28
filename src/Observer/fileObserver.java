package Observer;

import Factory.flyHeroFactory;
import Factory.flyVillainFactory;
import PowerPeople.flyHero;
import PowerPeople.flyVillain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class fileObserver implements Observer {
    private flyHeroFactory flyHeroFact = new flyHeroFactory();
    private String absolutePath = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects/" +
            "DistributedSystemsProject1/src/battleZones/battle.txt";
    boolean checkFile;
    File file = new File(absolutePath);

    public fileObserver(){
        createFile();
    }

    private void createFile(){
        try {
            checkFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(checkFile){
            System.out.println("Created a new file");
        }
        else{
            System.out.println("File already present at the specified location");
        }
    }

    public void update(boolean makeHero) {
        // If boolean is true then it will make a hero and put into the file
        // Make a way for it to move the battle file out and create a new one
        String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battleZones/battle.txt";
        if(makeHero){
            try {
                //Saving of object in a file
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                flyHero newHero = flyHeroFact.getHero();
                out.writeObject(newHero);

                System.out.println("The hero has been put in the battle file to stop the villain");
            }
            catch (Exception e) {
                // printStackTrace method
                // prints line numbers + call stack
                e.printStackTrace();
                // Prints what exception has been thrown
                System.out.println(e);
            }

        }
        else{
            flyVillainFactory flyVillainFact = new flyVillainFactory(); // Create the factory for making villains
            flyVillain flyVil = flyVillainFact.getVillain(); // Make hte villain

            try {
                //Saving of object in a file
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                // Method for serialization of object
                out.writeObject(flyVil);
                System.out.println("The villain has been placed into the battle zone");

                out.close();
                file.close();
            }
            catch (Exception e) {
                // printStackTrace method
                e.printStackTrace();
                // Prints what exception has been thrown
                System.out.println(e);
            }
        }
        // This should move the file to a new location
        moveFile();
    }

    public void moveFile(){
        checkFile = file.renameTo(new File("/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battlesDone/battle1.txt"));
        if(checkFile){
            System.out.println("Was successful");
            // Create a new file to be used
            createFile();
        }
        else {
            System.out.println("Failed");
        }
    }

    public void check(){
        System.out.println("The observer was added to observable");
    }
}
