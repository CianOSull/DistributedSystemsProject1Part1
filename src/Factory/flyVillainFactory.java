package Factory;

import PowerPeople.flyVillain;
import PowerPeople.villain;

public class flyVillainFactory implements villainFactory {

    // This factory creates a new fly villain
    public villain getVillain(String name, String power){ return new flyVillain(name, power); }

}
