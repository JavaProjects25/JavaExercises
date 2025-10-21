package Classes;

import Enums.EState;
import Interfaces.IMedicalTeam;
import Interfaces.IObserver;
import Interfaces.IState;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Nurse implements IState, IMedicalTeam, IObserver {


    int tirednessLevel;
    EState currentState;
    ArrayList<IObserver> observers;

    Emergency emergency;

    public Nurse( Emergency emergency){
        observers = new ArrayList<IObserver>();
        tirednessLevel = 0;
        currentState = EState.NotTired;
        emergency.delegatee = this;
        this.emergency = emergency;
    }

    public void addObserver(IObserver observer){
        observers.add(observer);
    }

    @Override
    public void performCPR() {
        System.out.println("Nurse is performing CPR...");

        tirednessLevel++;

        if(tirednessLevel >= 3){
            changeState();
        }
    }

    @Override
    public void rest() {
        IMedicalTeam.scheduler.schedule(() -> {
            System.out.println("Nurse has rested and is now available.");
            tirednessLevel = 0;
            changeState();
        }, 20, TimeUnit.SECONDS);

        //IMedicalTeam.scheduler.shutdown();
    }

    @Override
    public void changeState() {
        if(currentState == EState.NotTired){
            currentState = EState.Tired;
            notifyObservers();
            rest();
        }
        else if(currentState == EState.Tired) {
            currentState = EState.NotTired;
        }
    }

    void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update("Nurse is tired");
        }
    }
    @Override
    public void update(String availability) {
        System.out.println("Nurse received update: " + availability);

        if(currentState == EState.NotTired && emergency != null) {
            System.out.println("Nurse is taking over the tasks!");
            emergency.delegatee = this;
        }
        else if(currentState == EState.Tired){
            System.out.println("Nurse is also tired, cannot take over tasks.");
        }

    }
}
