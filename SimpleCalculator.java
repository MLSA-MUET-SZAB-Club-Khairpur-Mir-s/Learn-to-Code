import java.util.Random;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        Float y = sc.nextFloat();
        System.out.println("Enter the second number: ");
        Float z = sc.nextFloat();
        int choice;
        do {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Generate Random Number");
        System.out.println("6. Exit");
        System.out.println("Enter Your Choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The Addition is: " + (y+z));
                break;
            case 2:
                System.out.println("The Subtraction is: " + (y-z));
                break;
            case 3:
                System.out.println("The Multiplication is: " + (y*z));
                break;
            case 4:
                System.out.println("The Division is: " + (y/z));
                break;
            case 5:
                Random generateRandom = new Random();
                System.out.println("This Function will generate you a random value: ");
               System.out.println(generateRandom.nextFloat(5));
            default:
                break;
        }
        }while(choice!=6);
    }
}
