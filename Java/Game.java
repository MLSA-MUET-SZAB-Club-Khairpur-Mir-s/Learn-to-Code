import java.util.Scanner;
import java.util.Random;

class Game {
    public int num;
    public int inputNo;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        noOfGuesses = noOfGuesses;
    }

    Game() {
        Random ran = new Random();
        this.num = ran.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNo = sc.nextInt();
    }

    boolean isCorrectNum() {
        noOfGuesses++;
        if (inputNo == num) {
            System.out.format("Yes, you guessed it right, it was %d\nYou guessed it %d attempts ", num,
                    noOfGuesses);
            return true;
        } else if (inputNo < num) {
            System.out.println("Too low...");
        } else if (inputNo > num) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class Game1 {
    public static void main(String[] args) {


        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNum();
        }

    }
}
