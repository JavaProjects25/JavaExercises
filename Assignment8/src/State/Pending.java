package State;

public class Pending implements IState{

    private static Pending instance = new Pending();

    private Pending() {}

    @Override
    public void paymentState() {
        System.out.println("Payment Pending");
    }

    public static Pending Instance() {
        return instance;
    }
}
