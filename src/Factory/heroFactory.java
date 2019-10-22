package Factory;

import PowerPeople.hero;

// This interface has all the methods the hero factories will use
public interface heroFactory {

    public hero getHero(String name, String power);

}
