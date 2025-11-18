
import Adapters.LegacyCoffeeAdapter;
import Adapters.LegacyCoffeeMachine;
import Beverages.Interfaces.IBeverage;
import Decorators.*;
import Beverages.Classes.*;
import Visitors.Classes.*;
import Visitors.Interfaces.*;
import Visitors.Order;

public class Main {
    public static void main(String[] args) {

        //usage of decorators
        IBeverage SimpleJuice = new SimpleJuice();
        System.out.println("Simple Juice: Cost = " + SimpleJuice.getCost() + "; Description = " + SimpleJuice.getDescription());

        //Adding Ice to Juice
        IBeverage JuiceWithIce = new IceDecorator(new SimpleJuice());
        System.out.println("Juice with Ice: Cost = " + JuiceWithIce.getCost() + "; Description = " + JuiceWithIce.getDescription());

        //Adding Sugar to the Juice with Ice
        IBeverage JuiceWithSugar = new SugarDecorator(JuiceWithIce);
        System.out.println("Juice with Ice and Sugar: Cost = " + JuiceWithSugar.getCost() + "; Description = " + JuiceWithSugar.getDescription());

        IBeverage SimpleCocktail = new SimpleCocktail();
        System.out.println("Simple Cocktail: Cost = " + SimpleCocktail.getCost() + "; Description = " + SimpleCocktail.getDescription());

        //Adding Ice to Cocktail
        IBeverage CocktailWithIce = new IceDecorator(new SimpleCocktail());
        System.out.println("Cocktail with Ice: Cost = " + CocktailWithIce.getCost() + "; Description = " + CocktailWithIce.getDescription());

        //Adding Alcohol Shot to the Cocktail with Ice
        IBeverage CocktailWithAlcoholShot = new AlcoholShotDecorator(CocktailWithIce);
        System.out.println("Cocktail with Ice and Alcohol Shot: Cost = " + CocktailWithAlcoholShot.getCost() + "; Description = " + CocktailWithAlcoholShot.getDescription());

        //-------------------------------------------------------

        IOrderVisitor statisticsVisitor = new StatisticsVisitor();
        IOrderVisitor receiptVisitor = new ReceiptVisitor();
        IOrderVisitor caloriesVisitor = new CaloriesVisitor();

        Order order1 = new Order(SimpleJuice);
        order1.addVisitor(statisticsVisitor);
        order1.getInfoFromVisitors();

        Order order2 = new Order(CocktailWithAlcoholShot);
        order2.addVisitor(statisticsVisitor);
        order2.addVisitor(receiptVisitor);
        order2.addVisitor(caloriesVisitor);
        order2.getInfoFromVisitors();

        //-------------------------------------------------------

        LegacyCoffeeMachine legacyCoffeeMachine = new LegacyCoffeeMachine();
        IBeverage adaptedCoffee = new LegacyCoffeeAdapter(legacyCoffeeMachine, Adapters.EOldCoffee.LARGECOFFEEWITHMILK);

        IBeverage CoffeeWithSugar = new SugarDecorator(adaptedCoffee);
        System.out.println("Adapted Coffee with Sugar: Cost = " + CoffeeWithSugar.getCost() + "; Description = " + CoffeeWithSugar.getDescription());

        Order order3 = new Order(adaptedCoffee);
        order3.addVisitor(receiptVisitor);
        order3.getInfoFromVisitors();
    }
}