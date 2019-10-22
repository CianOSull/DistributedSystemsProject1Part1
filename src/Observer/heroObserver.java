package Observer;

import Factory.flyHeroFactory;
import PowerPeople.hero;

public class heroObserver implements Observer {
    private flyHeroFactory flyHeroFact;
    private hero newHero;


    public heroObserver(flyHeroFactory fHF){
        this.flyHeroFact = fHF;
    }

    public void update() {
        this.newHero = flyHeroFact.getHero();
    }
}
