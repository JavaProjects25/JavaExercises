package State;

public class Completed implements IState {

    public static Completed instance = new Completed();

    private Completed() {}

    @Override
    public void paymentState() {

    }

    public static Completed Instance() {
        return instance;
    }
}
