import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");

        while (true) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
o
            System.out.println("Round " + (rounds + 1));

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Your guess is out of the valid range. Try again.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                    attempts++;
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high. Try again.");
                    attempts++;
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    score++;
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }

            rounds++;
        }

        System.out.println("Game over! Rounds played: " + rounds + ", Score: " + score);
    }
}