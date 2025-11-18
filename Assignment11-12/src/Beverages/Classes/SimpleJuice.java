package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleJuice implements IBeverage {

    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Simple Fruit Juice";
    }

    @Override
    public int getCalories() {
        return 80;
    }
}
