public class SignObserver extends Observer {
    public SignObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        String result = "";
        if (subject.getState() < 0) { result = "negative"; }
        else if (subject.getState() > 0) { result = "positive"; }
        else { result = "zero"; }
        System.out.println("Sign: " + result);
    }
}
