package AfterState;

public class Lion {

    IState state;

    Lion() {
        state = Hungry.Instance(); //Hungry by default
    }

    void setState(IState s) {
        this.state = s;
    }

    IState getState() {
        return this.state;
    }

    void changeState() {

        if (getState() == Hungry.Instance()) {
            setState(NotHungry.Instance());
            NotHungry.Instance().mood(this);
        } else if (getState() == NotHungry.Instance()) {
            setState(Angry.Instance());
            Angry.Instance().mood(this);
        } else if (getState() == Angry.Instance()) {
            setState(Hungry.Instance());
            Hungry.Instance().mood(this);
        }

    }
}
