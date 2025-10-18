package AfterState;

class Hungry implements IState {

    private static Hungry instance = new Hungry();
    @Override
    public void mood(Lion simba) {
        System.out.println("Simba is hungry and pacing around.");
    }

    static Hungry Instance(){
        return instance;
    }
}
