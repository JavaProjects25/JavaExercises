package State;

public class Completed implements IState {

    public static Completed instance = new Completed();

    private Completed() {}

    @Override
    public void paymentState() {
        System.out.println("Payment Completed");
    }

    public static Completed Instance() {
        return instance;
    }
}
