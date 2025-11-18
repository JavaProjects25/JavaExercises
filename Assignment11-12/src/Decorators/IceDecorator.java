package Decorators;

import Beverages.Interfaces.IBeverage;

public class IceDecorator extends BeverageDecorator {

    public IceDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public double getCost(){
        return beverage.getCost() + 0.5;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Ice";
    }

    @Override
    public int getCalories() {
        return beverage.getCalories() + 0;
    }
}
