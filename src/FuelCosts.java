import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double gasPrice = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("Enter the gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input.");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input.");
            }
        } while (!done);

        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input.");
            }
        } while (!done);

        double costMiles = (100.0 / mpg) * gasPrice;
        double distance = gallons * mpg;

        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costMiles);
        System.out.printf("The maximum distance on full tank is: %.2f miles%n", distance);
    }
}