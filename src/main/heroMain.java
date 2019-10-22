package main;

import Factory.flyHeroFactory;
import Factory.flyVillainFactory;
import Observer.heroObserver;
import PowerPeople.flyVillain;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class heroMain {
    public static void main(String [] args) {
        String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battle.txt";

        flyHeroFactory flyHeroFact = new flyHeroFactory();
        heroObserver heroObserv = new heroObserver(flyHeroFact);
        flyVillainFactory flyVillainFact = new flyVillainFactory();
        flyVillain flyVil = flyVillainFact.getVillain();
        flyVil.addObserver(heroObserv);

        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
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

    }
}
