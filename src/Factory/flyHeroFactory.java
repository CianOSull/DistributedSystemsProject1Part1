package Factory;

import PowerPeople.flyHero;
import PowerPeople.hero;

public class flyHeroFactory implements heroFactory {

    private int counter = 0;
    private String power = "fly";

    // This factory creates a new fly hero
    public hero getHero(){ counter++; return new flyHero(Integer.toString(counter), power);  }

}
