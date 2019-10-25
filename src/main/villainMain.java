package main;

/*
    This main will run with hero main at the same time, this main will create a villain and then hero main will
    notice it and will then act on this]

    This main will create the file to put the villain in

    SOLUTION FOR 2 MAINS, SERALIZE THE HERO OBSERVER TO THE FILE AND THEN HAVE VILLAIN DESERIALISE AND PUT INTO VILLAIN
*/

import Observer.heroObserver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class villainMain {
    public static void main(String [] args) {
        //String filename = "battle.txt";
        //heroObserver heroObserv = new heroObserver();
        String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battleZones/battle.txt";

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


        /*
        OLD
        String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battle.txt";
        heroObserver heroOb;

        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));

            heroOb = (heroObserver)ois.readObject();

            flyVillainFactory flyVillainFact = new flyVillainFactory();
            flyVillain flyVil = flyVillainFact.getVillain();
            flyVil.addObserver(heroOb);

            //Saving of object in a file
            //FileOutputStream file = new FileOutputStream(filename);
            //ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(flyVil);
            flyVil.notifyObservs();
        }
        catch (Exception e) {
            // printStackTrace method
            // prints line numbers + call stack
            e.printStackTrace();
            // Prints what exception has been thrown
            System.out.println(e);
        }

         */
    }
}
