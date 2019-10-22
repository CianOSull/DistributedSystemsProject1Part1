package PowerPeople;

import Observer.Observable;
import Observer.heroObserver;

import java.io.Serializable;
import java.util.ArrayList;

// This is the main class for all villains
public class villain implements Serializable, Observable {
    private String name;
    private String power;
    private ArrayList<heroObserver> heroObsers = new ArrayList<heroObserver>();

    public villain(String n, String p){
        this.name = n;
        this.power = p;

    }

    public void addObserver(heroObserver observer) {
        this.heroObsers.add(observer);
    }

    public void notifyObservs(){
        for(int i = 0; i < heroObsers.size(); i++){
            heroObsers.get(i).update();
        }
    }

    public void removeObserver() {

    }

}
