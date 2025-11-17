
import Beverages.Interfaces.IBeverage;
import Decorators.*;
import Beverages.Classes.*;

public class Main {
    public static void main(String[] args) {


        //usage of decorators
        IBeverage SimpleJuice = new SimpleJuice();
        System.out.println("Simple Juice: Cost = " + SimpleJuice.GetCost() + "; Description = " + SimpleJuice.GetDescription());

        //Adding Ice to Juice
        IBeverage JuiceWithIce = new IceDecorator(new SimpleJuice());
        System.out.println("Juice with Ice: Cost = " + JuiceWithIce.GetCost() + "; Description = " + JuiceWithIce.GetDescription());

        //Adding Sugar to the Juice with Ice
        IBeverage JuiceWithSugar = new SugarDecorator(JuiceWithIce);
        System.out.println("Juice with Ice and Sugar: Cost = " + JuiceWithSugar.GetCost() + "; Description = " + JuiceWithSugar.GetDescription());

        IBeverage SimpleCocktail = new SimpleCocktail();
        System.out.println("Simple Cocktail: Cost = " + SimpleCocktail.GetCost() + "; Description = " + SimpleCocktail.GetDescription());

        //Adding Ice to Cocktail
        IBeverage CocktailWithIce = new IceDecorator(new SimpleCocktail());
        System.out.println("Cocktail with Ice: Cost = " + CocktailWithIce.GetCost() + "; Description = " + CocktailWithIce.GetDescription());

        //Adding Alcohol Shot to the Cocktail with Ice
        IBeverage CocktailWithAlcoholShot = new AlcoholDecorator(CocktailWithIce);
        System.out.println("Cocktail with Ice and Alcohol Shot: Cost = " + CocktailWithAlcoholShot.GetCost() + "; Description = " + CocktailWithAlcoholShot.GetDescription());

        //-------------------------------------------------------



    }
}