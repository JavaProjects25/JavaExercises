package State;

public class Failed implements IState {

    private static Failed instance = new Failed();

    private Failed() {}

    @Override
    public void paymentState() {
        System.out.println("Payment Failed");
    }

    public static Failed Instance() {
        return instance;
    }
}
