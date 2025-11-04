package Observer;

import State.IState;

public class Observer implements IObserver {
    String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void update(IState state) {
        System.out.println(name + " received state update: " + state);
    }

}
