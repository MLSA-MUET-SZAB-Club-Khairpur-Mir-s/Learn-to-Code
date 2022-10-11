import java.util.*;


// creating class
class Game {
    public int num;
    public int inputNo;
    public int noOfGuesses = 0;


    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int number_g) {
        noOfGuesses = number_g;
    }
// using constructer
    Game() {
        Random ran = new Random();

        this.num = ran.nextInt(100);

    }

    void takeUserInput() {
        System.out.print("Guess the number : ");
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


        Game game = new Game();
        boolean b = false;
        while (!b) {

            g.takeUserInput();
            b = g.isCorrectNum();

        }

    }
}
