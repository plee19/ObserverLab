import java.util.ArrayList;
import java.util.List;

/**
 * Subject class that will attach and detach observers to itself.
 * @author plee19
 * @version 1.0
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    /**
     * Method to return the state property held by the Subject.
     * @return int state property to be observed
     */
    public int getState() {
        return state;
    }

    /**
     * Method to set the state property held by the Subject.
     * @param state int state property to be observed
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * Method to attach an Observer instance to the Subject.
     * @param observer Observer to be attached to the Subject
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Method to detach an Observer instance from the Subject.
     * @param observer Observer to be detached from the Subject
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Method to force all connected Observer instances to run their update() methods.
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
