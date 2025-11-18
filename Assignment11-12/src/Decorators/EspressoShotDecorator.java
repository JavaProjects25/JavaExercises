package Decorators;

import Beverages.Interfaces.IBeverage;

abstract public class EspressoShotDecorator extends BeverageDecorator {

    EspressoShotDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.0; // adding cost of coffee shot
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Espresso Shot";
    }

    @Override
    public int getCalories() {
        return beverage.getCalories() + 5;
    }
}
