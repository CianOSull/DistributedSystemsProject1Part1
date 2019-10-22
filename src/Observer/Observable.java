package Observer;

// This interface implements all the methods for classes that will be observed
public interface Observable {

    // This will add the observers that will be notified when a change occurs,
    //public void addObserver(Object observer);

    // Notify the observers
    public void notifyObservs();

    // Remove an unneeded observer
    //public void removeObserver();

}
