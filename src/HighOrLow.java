import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int randomNumber = generator.nextInt(10) + 1; // generates a random number between 1 and 10

        int userGuess = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();

                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("Number must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input.");
            }
        } while (!done);

        System.out.println("Random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("You guessed it!");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }
}
