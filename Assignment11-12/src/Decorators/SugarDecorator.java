package Decorators;
import Beverages.Interfaces.*;
public class SugarDecorator extends EspressoShotDecorator {

    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5; // adding cost of sugar
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public int getCalories() {
        return beverage.getCalories() + 200;
    }

}
