package Beverages.Classes;

import Beverages.Interfaces.IBeverage;

public class SimpleTea implements IBeverage {

    @Override
    public double GetCost() {
        return 2.0;
    }

    @Override
    public String GetDescription() {
        return "Simple black Tea";
    }
}
