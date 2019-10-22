package Observer;

// This interface implements all the methods for classes that will be observed
public interface Observable {

    // This will add the observers that will be notified when a change occurs
    public void addObserver();

    // Notify the observers
    public void obNotify();

    // Remove an unneeded observer
    public void removeObserver();

}
