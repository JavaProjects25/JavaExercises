package Classes;

import Enums.EState;
import Interfaces.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Paramedic implements IState, IMedicalTeam, IObserver {

    int tirednessLevel;
    EState currentState;
    ArrayList<IObserver> observers;

    Emergency emergency;
    public Paramedic(Emergency emergency){
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
    public void performCPR() {
        System.out.println("Paramedic is performing CPR...");

        tirednessLevel++;

        if(tirednessLevel >= 3){
            changeState();
        }
    }

    @Override
    public void rest() {
        IMedicalTeam.scheduler.schedule(() -> {
            System.out.println("Paramedic has rested and is now available.");
            tirednessLevel = 0;
            changeState();
        }, 10, TimeUnit.SECONDS);

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
            observer.update("Paramedic is tired");
        }
    }
    @Override
    public void update(String availability) {
        System.out.println("Paramedic received update: " + availability);

        if(currentState == EState.NotTired && emergency != null) {
            System.out.println("Paramedic is taking over the tasks!");
            emergency.delegatee = this;
        }
        else if(currentState == EState.Tired) {
            System.out.println("Paramedic is also tired, cannot take over tasks.");
        }
    }
}
