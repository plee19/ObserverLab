/**
 * Observer abstract class to require all extensions of itself to implement a Subject instance and update() method.
 * @author plee19
 * @version 1.0
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}