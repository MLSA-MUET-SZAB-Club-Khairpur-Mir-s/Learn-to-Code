import java.util.Random;
import java.util.Scanner;

public class Lab03_Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        Random ra = new Random();
        int randNum = ra.nextInt(5,150);
        while (a>0){
            System.out.println("Guess the number between 5 to 150");
            int guessNum = sc.nextInt();
            if (guessNum>randNum){
                System.out.println("Guess number is too high");
            }
            if (guessNum<randNum){
                System.out.println("Guess number is too low");
            }
            if (guessNum==randNum){
                System.out.println("You Guess the correct number !!");
                System.out.println("Random number is "+randNum);
                System.exit(0);
            }
        }
    }
}
