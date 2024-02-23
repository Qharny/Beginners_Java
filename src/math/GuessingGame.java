package math;

import java.util.Scanner;
import java.util.Random;

// 🥲🥲😂 more tedious than I expected.
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        // generate random numbers
        int randomNumber = random.nextInt(5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.print("Guess the number between 0 and 4: "); // I used the print instead of the println to be able to write the text on the same line

        // Get user input.
        int userGuess = scanner.nextInt();

        if (userGuess < 0 || userGuess > 4) {
            System.out.println("Invalid guess! Please enter a number between 0 and 4.");
        } else if (userGuess == randomNumber) {
            System.out.println("Congratulations, you won! The number was " + randomNumber);
        } else if (userGuess > randomNumber) {
            System.out.println("You lost, number too high! The number was " + randomNumber);
        } else {
            System.out.println("You lost, number too low! The number was " + randomNumber);
        }

        scanner.close();
    }
}