package Classes;
import Interfaces.*;
import Enums.*;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Doctor implements IState, IMedicalTeam, IObserver {
    // Properties
    EState currentState;
    int tirednessLevel;
    ArrayList<IObserver> observers;

    Emergency emergency;

    public Doctor(Emergency emergency) {
        observers = new ArrayList<IObserver>();
        currentState = EState.NotTired;
        tirednessLevel = 0;
        emergency.delegatee = this;
        this.emergency = emergency;
    }

    
    public void addObserver(IObserver observer){
        observers.add(observer);
    }

    @Override
    public void changeState(){
        if(currentState == EState.NotTired){
            currentState = EState.Tired;
            notifyObservers();
            rest();
        }
        else if(currentState == EState.Tired) {
            currentState = EState.NotTired;
        }
    }

    @Override
    public void performCPR() {
        System.out.println("Doctor is performing CPR...");

        tirednessLevel++;

        if(tirednessLevel >= 3){
            changeState();
        }
    }

    @Override
    public void rest() {

        IMedicalTeam.scheduler.schedule(() -> {
            System.out.println("Doctor has rested and is now available.");
            tirednessLevel = 0;
            changeState();
        }, 15, TimeUnit.SECONDS);

        //IMedicalTeam.scheduler.shutdown();
        // ^ We don't shut down the scheduler here to allow other medical team members to use it.
    }

    void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update("Doctor is tired");
        }
    }
    @Override
    public void update(String availability) {

        System.out.println("Doctor received update: " + availability);

        if(currentState == EState.NotTired && emergency != null) {
            System.out.println("Doctor is taking over the tasks!");
            emergency.delegatee = this;
        }
        else if (currentState == EState.Tired) {
            System.out.println("Doctor is also tired, cannot take over tasks.");
        }
    }
}
