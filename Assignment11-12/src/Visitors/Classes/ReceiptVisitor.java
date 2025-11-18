package Visitors.Classes;

import Beverages.Interfaces.IBeverage;
import Visitors.Interfaces.IOrderVisitor;
import Visitors.Order;

import java.util.List;

public class ReceiptVisitor implements IOrderVisitor {

    @Override
    public void visit(Order order) {

        List<IBeverage> beverages = order.getOrders();
        double totalPrice = 0;
        for(IBeverage beverage : beverages) {
            System.out.println("Beverage: " + beverage.getDescription() + " - Price: $" + beverage.getCost());
            totalPrice += beverage.getCost();
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}
