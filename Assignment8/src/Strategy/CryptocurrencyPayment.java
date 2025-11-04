package Strategy;


public class CryptocurrencyPayment implements IPaymentStrategy {
    private String coin;

    public CryptocurrencyPayment(String coin) {
        this.coin = coin;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using " + coin + ".");
    }
}
