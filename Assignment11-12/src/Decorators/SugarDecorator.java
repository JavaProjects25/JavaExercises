package Decorators;
import Beverages.Interfaces.*;
public class SugarDecorator extends CoffeeShotDecorator {

    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double GetCost() {
        return beverage.GetCost() + 0.5; // adding cost of sugar
    }

    @Override
    public String GetDescription() {
        return beverage.GetDescription() + ", Sugar";
    }

}
