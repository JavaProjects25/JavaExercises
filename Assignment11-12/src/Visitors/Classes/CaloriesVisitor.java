package Visitors.Classes;

import Beverages.Interfaces.IBeverage;
import Visitors.Interfaces.IOrderVisitor;

import Visitors.Order;

import java.util.List;

public class CaloriesVisitor implements IOrderVisitor {

    @Override
    public void visit(Order order) {

        List<IBeverage> beverages = order.getOrders();
        double totalCalories = 0;

        for(IBeverage beverage : beverages) {
            totalCalories += beverage.getCalories();
        }

        System.out.println("Total Calories: " + totalCalories + " kcal");
    }
}
