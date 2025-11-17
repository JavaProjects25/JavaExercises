package Decorators;

import Beverages.Interfaces.IBeverage;

public class AlcoholDecorator extends BeverageDecorator {

    public AlcoholDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public double GetCost(){
        return beverage.GetCost() + 5.0;
    }

    @Override
    public String GetDescription(){
        return beverage.GetDescription() + ", Alcohol";
    }
}
