package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleCoffee implements IBeverage {

    @Override
    public double getCost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Simple black Coffee";
    }

    @Override
    public int getCalories() {
        return 5;
    }
}
