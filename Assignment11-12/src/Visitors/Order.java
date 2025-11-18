package Visitors;
import java.util.ArrayList;
import java.util.List;

import Beverages.Interfaces.IBeverage;
import Visitors.Interfaces.IOrderVisitor;

public class Order {
    List<IBeverage> orders = new ArrayList<>();

    List<IOrderVisitor> visitors = new ArrayList<>();


    public Order(IBeverage beverage){
        orders.add(beverage); //need to order at least one thing to have a valid order
    }

    public void addToOrder(IBeverage beverage){
        orders.add(beverage);
    }
    public void addVisitor(IOrderVisitor orderVisitor){
        visitors.add(orderVisitor);
    }

    public void removeVisitor(IOrderVisitor orderVisitor){
        visitors.remove(orderVisitor);
    }
    public void removeFromOrder(IBeverage beverage){
        orders.remove(beverage);
    }

    public List<IBeverage> getOrders(){
        return orders;
    }

    public List<IOrderVisitor> getVisitors(){
        return visitors;
    }

    public void getInfoFromVisitors(){
        for(IOrderVisitor visitor : visitors){
            visitor.visit(this);
        }
    }
}
