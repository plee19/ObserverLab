public class ObserverPatternDemo {

    /**
     * Main method for demonstration of observer classes and methods.
     * @author plee19
     * @version 1.0
     */
    public static void main(String[] args) {
        Subject subject = new Subject();

        // HexaObserver provided a name for detach
        HexaObserver hexOb = new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        new SignObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
        System.out.println("Third state change: -5");
        subject.setState(-5);
        System.out.println("Fourth state change: 0");
        subject.setState(0);

        // Detach demonstration
        subject.detach(hexOb);
        System.out.println("Fifth state change after detach: 15");
        subject.setState(15);
    }
}
