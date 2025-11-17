package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleJuice implements IBeverage {

    @Override
    public double GetCost() {
        return 5.0;
    }

    @Override
    public String GetDescription() {
        return "Simple Fruit Juice";
    }
}
