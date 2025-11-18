package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleTea implements IBeverage {

    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Simple black Tea";
    }

    @Override
    public int getCalories() {
        return 10;
    }
}
