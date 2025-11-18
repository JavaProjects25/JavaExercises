package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleCocktail implements IBeverage {

    @Override
    public double getCost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Simple Cocktail";
    }

    @Override
    public int getCalories() {
        return 100;
    }
}
