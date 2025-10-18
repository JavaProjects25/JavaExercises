package AfterState;

public class NotHungry implements IState {

    private static NotHungry instance = new NotHungry();

    @Override
    public void mood(Lion simba) {
        System.out.println("Simba is not hungry and is calm.");
    }

    static NotHungry Instance(){
        return instance;
    }
}
