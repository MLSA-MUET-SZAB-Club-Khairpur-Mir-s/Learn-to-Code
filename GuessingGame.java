import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1; // Guess a number between 1 and 10
        int userGuess;

        do {
            System.out.print("Guess the number (1-10): ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        } while (userGuess != numberToGuess);
    }
}
