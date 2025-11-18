package Adapters;

import Beverages.Interfaces.IBeverage;

public class LegacyCoffeeAdapter implements IBeverage { //we implement IBeverages to adapt the legacy coffee machine to the new system of IBeverages

    private LegacyCoffeeMachine legacyCoffeeMachine;

    private EOldCoffee oldCoffeeType;
    public LegacyCoffeeAdapter(LegacyCoffeeMachine legacyCoffeeMachine, EOldCoffee oldCoffeeType) {
        this.legacyCoffeeMachine = legacyCoffeeMachine;
        this.oldCoffeeType = oldCoffeeType;
    }

    @Override
    public double getCost() {
        return switch(oldCoffeeType){
            case SMALLCOFFEE -> legacyCoffeeMachine.getSmallCoffeeCost();
            case LARGECOFFEEWITHMILK -> legacyCoffeeMachine.getLargeCoffeeWithMilkCost();
        };
    }

    @Override
    public String getDescription() {
        return switch(oldCoffeeType){
            case SMALLCOFFEE -> legacyCoffeeMachine.getSmallCoffeeDescription();
            case LARGECOFFEEWITHMILK -> legacyCoffeeMachine.getLargeCoffeeWithMilkDescription();
        };
    }

    @Override
    public int getCalories() {
        return switch(oldCoffeeType){
            case SMALLCOFFEE -> legacyCoffeeMachine.getSmallCoffeeCalories();
            case LARGECOFFEEWITHMILK -> legacyCoffeeMachine.getLargeCoffeeWithMilkCalories();
        };
    }

}
