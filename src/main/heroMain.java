package main;

import Observer.heroObserver;

import java.io.*;

public class heroMain {
    public static void main(String [] args) {
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
    }
}
