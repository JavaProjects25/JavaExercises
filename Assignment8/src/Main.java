import java.util.Scanner;
import java.util.Timer;
import java.util.Random;

import Observer.*;
import Strategy.*;
import State.*;

public class Main {
    public static void main(String[] args) {

        // Observers
        Observer client = new Observer("Observer Client");
        Observer processor = new Observer("Observer Processor");

        //functionality
        Scanner scanner = new Scanner(System.in);
        String paymentAmount;
        int amount = 0;
        String paymentMethod = "";
        int paymentMethodInt = 0;
        Timer timer = new Timer();
        Random random = new Random();

        // Strategy
        ShoppingCart cart = new ShoppingCart();
        PaymentHandler paymentHandler = new PaymentHandler();

        paymentHandler.addObserver(client);
        paymentHandler.addObserver(processor);


        // Payment process
        System.out.print("Enter the payment amount: ");
        paymentAmount = scanner.nextLine();

        while(tryParseInt(paymentAmount) < 0){
            System.out.println("Please write a correct amount:");
            paymentAmount = scanner.nextLine();
        }
        amount = tryParseInt(paymentAmount);



        while ((tryParseInt(paymentMethod) < 1 || tryParseInt(paymentMethod) > 3)) {

            System.out.println("Enter the payment method: 1 for Credit Card, 2 for PayPal, 3 for Cryptocurrency ");
            paymentMethod = scanner.nextLine();
        }

        paymentMethodInt = tryParseInt(paymentMethod);

        switch(paymentMethodInt){
            case 1:
                String cardNumber;
                String cardHolder;
                System.out.print("Enter the card number: ");
                cardNumber = scanner.nextLine();
                System.out.print("Enter the card holder name: ");
                cardHolder = scanner.nextLine();
                cart.setPaymentStrategy(new CreditCardPayment(cardNumber, cardHolder));
                break;

            case 2:
                String email;
                System.out.print("Enter the PayPal email: ");
                email = scanner.nextLine();
                cart.setPaymentStrategy(new PayPalPayment(email));
                break;

            case 3:
                String coin;
                System.out.println("Enter your coin type");
                coin = scanner.nextLine();
                cart.setPaymentStrategy(new CryptocurrencyPayment(coin));
                break;

            default:
                System.out.println("Invalid payment method selected.");
                break;
        }


        //wait for 2 seconds to simulate payment processing
        System.out.println("Processing payment...");
        paymentHandler.setState(Pending.Instance()); // Instance is static (Singleton)
        paymentHandler.notifyObservers();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        simulatePayment(random, paymentHandler);

    }

    static void simulatePayment(Random random, PaymentHandler paymentHandler) {

        int paymentResult = random.nextInt(2); // 0: success, 1: failure

        if(paymentResult == 0){
            //completed
            paymentHandler.setState(Completed.Instance());
            paymentHandler.notifyObservers();
            System.out.println("Payment completed successfully. Thank you for your purchase!");
        }

        else{
            //failed
            paymentHandler.setState(Failed.Instance());
            paymentHandler.notifyObservers();
            System.out.println("Payment failed. Get a job. You're broke.");
        }
    }

    static int tryParseInt(String intInString){

        try {
            int intInInt = Integer.parseInt(intInString);
            return intInInt;
        }
        catch (NumberFormatException e) {
            return -1;
        }
    }
}