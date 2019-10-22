package Factory;

import PowerPeople.flyHero;
import PowerPeople.hero;

public class flyHeroFactory implements heroFactory {

    // This factory creates a new fly hero
    public hero getHero(String name, String power){ return new flyHero(name, power); }

}
