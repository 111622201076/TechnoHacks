import java.util.Random;
import java.util.Scanner;

public class numberguess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
