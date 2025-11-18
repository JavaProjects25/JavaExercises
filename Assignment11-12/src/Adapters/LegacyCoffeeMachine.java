package Adapters;

public class LegacyCoffeeMachine{


    public String getSmallCoffeeDescription(){
        return "Small Coffee";
    }

    public double getSmallCoffeeCost(){
        return 2.0;
    }

    public int getSmallCoffeeCalories(){
        return 3;
    }

    public void makeSmallCoffee(){
        System.out.println("Making: " + getSmallCoffeeDescription() + " Cost: " + getSmallCoffeeCost() + " Calories: " + getSmallCoffeeCalories());
    }

    public String getLargeCoffeeWithMilkDescription (){
        return "Large Coffee with Milk";
    }
    public double getLargeCoffeeWithMilkCost(){
        return 3.5;
    }
    public int getLargeCoffeeWithMilkCalories(){
        return 7;
    }
    public void makeLargeCoffeeWithMilk(){
        System.out.println("Making: " + getLargeCoffeeWithMilkDescription() + " Cost: " + getLargeCoffeeWithMilkCost() + " Calories: " + getLargeCoffeeWithMilkCalories());
    }
}
