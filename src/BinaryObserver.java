/**
 * BinaryObserver class to extend the Observer parent class, to be attached to a Subject instance upon construction.
 * @author plee19
 * @version 1.0
 */

public class BinaryObserver extends Observer {
    /**
     * Constructor for BinaryObserver to have the Subject attach this SignObserver to itself.
     * @param subject Subject which attaches this observer to itself
     */
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Overridden update() method to print a binary String to console based on the state.
     */
    @Override
    public void update() {
        System.out.println( "Binary String: " +
                Integer.toBinaryString(subject.getState()));
    }
}
