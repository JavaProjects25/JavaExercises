package Decorators;

import Beverages.Interfaces.IBeverage;

abstract public class BeverageDecorator implements IBeverage {

    protected IBeverage beverage;

    public BeverageDecorator(IBeverage beverage){

        this.beverage = beverage;
    }

    @Override
    public double getCost(){
        return beverage.getCost();
    }

    @Override
    public String getDescription(){
        return beverage.getDescription();
    }

    @Override
    public int getCalories() {
        return beverage.getCalories();
    }
}
