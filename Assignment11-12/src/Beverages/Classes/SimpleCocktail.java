package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleCocktail implements IBeverage {

    @Override
    public double GetCost() {
        return 10.0;
    }

    @Override
    public String GetDescription() {
        return "Simple Cocktail";
    }
}
