package AfterState;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lion simba = new Lion();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please press enter to change Simba's mood");

            String input = sc.nextLine();

            simba.changeState();
        }

    }
}