package main;

/*
    This main will run with hero main at the same time, this main will create a villain and then hero main will
    notice it and will then act on this]

    This main will create the file to put the villain in

    SOLUTION FOR 2 MAINS, SERALIZE THE HERO OBSERVER TO THE FILE AND THEN HAVE VILLAIN DESERIALISE AND PUT INTO VILLAIN
*/

public class villainMain {
    public static void main(String [] args) {
        /*
        String filename = "/home/cianosullivan/Desktop/CIT/3rd Year/Semester 1/Java projects" +
                "/DistributedSystemsProject1/src/battleZones/battle.txt";

        heroObserver heroOb = null;
        flyVillainFactory flyVillainFact = new flyVillainFactory(); // Create the factory for making villains
        flyVillain flyVil = flyVillainFact.getVillain(); // Make hte villain

        // Deserialization
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));

            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            heroOb = (heroObserver) in.readObject();
            flyVil.addObserver(heroOb);

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(flyVil);
            System.out.println("The villain has been placed into the battle zone");
            flyVil.notifyObservs();

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

    }
}
