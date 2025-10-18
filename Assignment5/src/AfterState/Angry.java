package AfterState;

class Angry implements IState{

    //singleton pattern
    //private so no one can re instantiate, static so there can only be one
    //Angry is the type of this instance, and instance is the name.
    private static Angry instance = new Angry();
    @Override
    public void mood(Lion simba){
        System.out.println("Simba is angry and roaring!");
    }

    static Angry Instance(){
        return instance;
    }
}
