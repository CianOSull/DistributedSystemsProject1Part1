package Factory;

import PowerPeople.villain;

// This interface has all the methods the villain factories will use
public interface villainFactory {

    public villain getVillain(String name, String power);

}
