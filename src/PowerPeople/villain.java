package PowerPeople;

import Observer.Observable;

import java.io.Serializable;

// This is the main class for all villains
public class villain implements Serializable, Observable {
    String name;
    String power;

    public villain(String n, String p){
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
