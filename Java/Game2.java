//import java.util.*;  // use separate package for everyone

import java.util.Random; // for random number generating
import java.util.Scanner; // for input any value

public class Game2 {
public static void main(String[] args) {
    // 0 for rock
    // 1 for papaer
    // 2 for scissor

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter 0 for rock 1 for papaer 2 for scissor");
    int userInput =sc.nextInt();


    Random random =new Random(); // object for function
    int computerInput =random.nextInt(3);

    if (userInput == computerInput) {
    System.out.println("Draw");        
    } else if(userInput == 0 && computerInput ==2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput ==1) {
    System.out.println("You win");        
    } else{
        System.out.println("Computer win");
    }
    System.out.println("Computer choice: "+ computerInput);

}
}
