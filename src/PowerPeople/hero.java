package PowerPeople;

import Observer.Observable;

import java.io.Serializable;

// This is the main class for all heros
public class hero implements Serializable, Observable {
    private String name;
    private String power;

    public hero(String n, String p){
        this.name = n;
        this.power = p;
    }

    public void addObserver() {

    }

    public void notifyObservs(){

    }

    public void removeObserver() {

    }

}
