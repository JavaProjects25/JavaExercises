package Decorators;

import Beverages.Interfaces.IBeverage;

abstract public class CoffeeShotDecorator extends BeverageDecorator {

    CoffeeShotDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public double GetCost() {
        return beverage.GetCost() + 2.0; // adding cost of coffee shot
    }

    @Override
    public String GetDescription() {
        return beverage.GetDescription() + ", Coffee Shot";
    }
}
