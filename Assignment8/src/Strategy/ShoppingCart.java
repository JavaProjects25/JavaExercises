package Strategy;

import State.IState;
import State.Pending;

public class ShoppingCart {
    private IPaymentStrategy paymentStrategy;

     public void setPaymentStrategy(IPaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Please set a payment strategy first.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
