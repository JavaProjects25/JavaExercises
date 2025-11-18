package Visitors.Interfaces;

import Visitors.Order;

public interface IOrderVisitor {
    void visit(Order order);
}
