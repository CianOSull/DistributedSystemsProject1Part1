package Observer;

import Factory.flyHeroFactory;
import PowerPeople.flyHero;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class heroObserver implements Observer, Serializable {
    private flyHeroFactory flyHeroFact;
    private flyHero newHero;
    private String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
            "/DistributedSystemsProject1/src/battle.txt";


    public heroObserver(flyHeroFactory fHF){
        this.flyHeroFact = fHF;
    }

    // When this is called, that means a villain was created and it will output the hero to deal with the villain
    public void update() {
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            this.newHero = flyHeroFact.getHero();
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
}
