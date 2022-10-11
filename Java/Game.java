import java.util.Scanner;
import java.util.Random;

// creating class
class Game {
    public int number;
    public int inputNo;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        noOfGuesses = noOfGuesses;
    }
// using constructer
    Game() {
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNo = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNo == number) {
            System.out.format("Yes, you guessed it right, it was %d\nYou guessed it %d attempts ", number,
                    noOfGuesses);
            return true;
        } else if (inputNo < number) {
            System.out.println("Too low...");
        } else if (inputNo > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class Game1 {
    public static void main(String[] args) {


        Game game = new Game();
        boolean b = false;
        while (!b) {
            game.takeUserInput();
            b = game.isCorrectNumber();
        }

    }
}
