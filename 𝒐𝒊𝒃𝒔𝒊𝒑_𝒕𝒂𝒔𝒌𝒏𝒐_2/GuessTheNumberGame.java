package OasisInfobyte.NumberGuissingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    private static final int MAX_ATTEMPTS = 5;
    private static final int MAX_ROUNDS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("You have " + MAX_ROUNDS + " rounds to play.");
        System.out.println("In each round, you need to guess the number (between 1 and 100) within " + MAX_ATTEMPTS + " attempts.");
        System.out.println("You score more points if you guess the number in fewer attempts.");

        for (int round = 1; round <= MAX_ROUNDS; round++) {
            System.out.println("\n--- Round " + round + " ---");
            int roundScore = playRound(scanner);
            totalScore += roundScore;
            System.out.println("Score for this round: " + roundScore);
            System.out.println("Total Score after round " + round + ": " + totalScore);
        }

        System.out.println("\nGame Over! Your total score is: " + totalScore);
        scanner.close();
    }

    // Method to play a single round
    private static int playRound(Scanner scanner) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int attemptsLeft = MAX_ATTEMPTS;
        int score = 0;

        while (attemptsLeft > 0) {
            System.out.print("Enter your guess (1-100): ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the correct number.");
                score = attemptsLeft * 10; // Points based on remaining attempts
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }

            attemptsLeft--;
            System.out.println("Attempts left: " + attemptsLeft);
        }

        if (attemptsLeft == 0) {
            System.out.println("Sorry! You've run out of attempts. The number was: " + numberToGuess);
        }

        return score;
    }
}

