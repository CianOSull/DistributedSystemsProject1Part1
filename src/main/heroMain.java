package main;

/*
    THIS PROJECT WILL IMPLEMENT THREADING
    How to do 2 mains:
    1. have villain main make the villain and output to the battle zone
    2. Have something detect the battlezone edit and then create the hero and notify the observer
 */

import Observer.heroObserver;

import java.io.*;

public class heroMain {
    public static void main(String [] args) {
        //String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects/DistributedSystemsProject1/src/battle.txt";
        //String filename = "battle.txt";
        String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battleZones/battle.txt";
        heroObserver heroObserv = new heroObserver();

        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(heroObserv);

            out.close();
            file.close();

            System.out.println("File should be outputted");
        }
        catch (Exception e) {
            // printStackTrace method
            // prints line numbers + call stack
            e.printStackTrace();
            // Prints what exception has been thrown
            System.out.println(e);
        }
        /*
        heroObserver object1 = null;

        // Deserialization
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));

            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (heroObserver) in.readObject();
            object1.check();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

         */
    }
}
