package Decorators;

import Beverages.Interfaces.IBeverage;

public class IceDecorator extends BeverageDecorator {

    public IceDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public double GetCost(){
        return beverage.GetCost() + 0.5;
    }

    @Override
    public String GetDescription(){
        return beverage.GetDescription() + ", Ice";
    }
}
