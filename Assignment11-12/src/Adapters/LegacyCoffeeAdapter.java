package Adapters;

import Beverages.Interfaces.IBeverage;

public class LegacyCoffeeAdapter implements IBeverage { //we implement IBeverages to adapt the legacy coffee machine to the new system of IBeverages

    private LegacyCoffeeMachine legacyCoffeeMachine;

    private EOldCoffee OldCoffeeType;
    public LegacyCoffeeAdapter(LegacyCoffeeMachine legacyCoffeeMachine, EOldCoffee OldCoffeeType) {
        this.legacyCoffeeMachine = legacyCoffeeMachine;
        this.OldCoffeeType = OldCoffeeType;
    }

    @Override
    public double getCost() {
        return switch(OldCoffeeType){
            case SMALLCOFFEE -> legacyCoffeeMachine.getSmallCoffeeCost();
            case LARGECOFFEEWITHMILK -> legacyCoffeeMachine.getLargeCoffeeWithMilkCost();
        };
    }

    @Override
    public String getDescription() {
        return switch(OldCoffeeType){
            case SMALLCOFFEE -> legacyCoffeeMachine.getSmallCoffeeDescription();
            case LARGECOFFEEWITHMILK -> legacyCoffeeMachine.getLargeCoffeeWithMilkDescription();
        };
    }

    @Override
    public int getCalories() {
        return switch(OldCoffeeType){
            case SMALLCOFFEE -> legacyCoffeeMachine.getSmallCoffeeCalories();
            case LARGECOFFEEWITHMILK -> legacyCoffeeMachine.getLargeCoffeeWithMilkCalories();
        };
    }

}
