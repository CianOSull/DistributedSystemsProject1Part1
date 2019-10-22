package PowerPeople;

import Observer.Observable;

import java.io.Serializable;

// This is the main class for all heros
public class hero implements Serializable, Observable {
    String name;
    String power;

    public hero(String n, String p){
        this.name = n;
        this.power = p;
    }

    public void addObserver() {

    }

    public void obNotify(){

    }

    public void removeObserver() {

    }

}
