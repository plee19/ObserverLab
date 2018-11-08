/**
 * SignObserver class to observe positive/negative/zero state for Subject upon state change
 * @author plee19
 * @version 1.0
 */

public class SignObserver extends Observer {
    /**
     * Constructor for SignObserver to have the Subject attach this SignObserver to itself.
     * @param subject Subject which attaches this observer to itself
     */
    public SignObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * Overridden update() method to print negative, positive, or zero state to console.
     */
    public void update() {
        String result = "";
        if (subject.getState() < 0) { result = "negative"; }
        else if (subject.getState() > 0) { result = "positive"; }
        else { result = "zero"; }
        System.out.println("Sign: " + result);
    }
}
