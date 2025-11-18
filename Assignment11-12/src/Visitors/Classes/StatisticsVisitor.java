package Visitors.Classes;

import Beverages.Interfaces.IBeverage;
import Visitors.Interfaces.IOrderVisitor;
import Visitors.Order;

import java.util.List;

public class StatisticsVisitor implements IOrderVisitor {

    @Override
    public void visit(Order order) {

        List<IBeverage> beverages = order.getOrders();

        for(IBeverage beverage : beverages) {
            System.out.println("Beverage: " + beverage.getDescription());
        }
    }
}
