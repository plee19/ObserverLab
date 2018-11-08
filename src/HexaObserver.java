/**
 * HexaObserver class to extend the Observer parent class, to be attached to a Subject instance upon construction.
 * @author plee19
 * @version 1.0
 */
public class HexaObserver extends Observer {
    /**
     * Constructor for HexaObserver to have the Subject attach this HexaObserver to itself.
     * @param subject Subject which attaches this observer to itself
     */
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Overridden update() method to print a hexadecimal String to console based on the state.
     */
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
