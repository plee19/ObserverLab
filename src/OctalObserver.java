/**
 * OctalObserver class to extend the Observer parent class, to be attached to a Subject instance upon construction.
 * @author plee19
 * @version 1.0
 */

public class OctalObserver extends Observer {
    /**
     * Constructor for OctalObserver to have the Subject attach this OctalObserver to itself.
     * @param subject Subject which attaches this observer to itself
     */
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Overridden update() method to print an octal String to console based on the state.
     */
    @Override
    public void update() {
        System.out.println("Octal: " +
                Integer.toOctalString(subject.getState()));
    }
}
