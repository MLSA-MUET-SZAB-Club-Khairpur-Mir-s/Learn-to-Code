import java.util.*;


// creating class
class Game {
     int ran_number;
     int inputNo;
    int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int number_g) {
        noOfGuesses = number_g;
    }
// using constructer
    Game() {
        Random ran = new Random();
        this.ran_number = ran.nextInt(200);
    }

    void takeUserInput() {
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNo = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNo == number) {
            System.out.format("Yes, you guessed it right, it was %d \nYou guessed it %d attempts ", number,
                    noOfGuesses);
            return true;
        } else if (inputNo < number) {
            System.out.println("Your gussed  number is smaller  ");
        } else if (inputNo > number) {
            System.out.println("Your gussed  number is larger  ");
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
