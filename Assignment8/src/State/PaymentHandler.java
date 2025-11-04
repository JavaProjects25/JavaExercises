package State;

import Observer.*;

import java.util.ArrayList;

public class PaymentHandler {


    //payment handler has a state, and its also the subject that is going to be observed (controls the states)
    private IState state; // aggregation

    ArrayList<IObserver> observers;

    public PaymentHandler() {

        this.state = Pending.Instance();
        observers = new ArrayList<>();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public IState getState() {
        return state;
    }

    public void addObserver(IObserver iObserver) {
        observers.add(iObserver);
    }

    public void removeObserver(IObserver iObserver) {
        observers.remove(iObserver);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(this.state);
        }
    }
}
