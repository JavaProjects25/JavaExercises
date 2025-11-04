package Strategy;

public class CreditCardPayment implements IPaymentStrategy {
    private String cardNumber;
    private String name; // Cardholder name

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
