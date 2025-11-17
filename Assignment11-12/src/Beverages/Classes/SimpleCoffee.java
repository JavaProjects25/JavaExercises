package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleCoffee implements IBeverage {

    @Override
    public double GetCost() {
        return 2.5;
    }

    @Override
    public String GetDescription() {
        return "Simple black Coffee";
    }
}
