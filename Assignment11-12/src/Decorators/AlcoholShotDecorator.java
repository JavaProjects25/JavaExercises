package Decorators;

import Beverages.Interfaces.IBeverage;

public class AlcoholShotDecorator extends BeverageDecorator {

    public AlcoholShotDecorator(IBeverage beverage){
        super(beverage);
    }

    @Override
    public double getCost(){
        return beverage.getCost() + 5.0;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + ", Alcohol Shot";
    }

    @Override
    public int getCalories() {
        return beverage.getCalories() + 80;
    }

}
