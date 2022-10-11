import java.util.Scanner;
public class CountNumbers {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n, count_negative=0,count_zeroes=0, count_positive = 0, choice =0;
    do {
        System.out.println("Enter the numbers");
        n = sc.nextInt();
        // using if conditions 
        if(n>0) {
        count_positive++; 
        // count postive numbers 
        }
        else if (n<0) {
            count_negative++;
         // count negative  numbers
        }
        else {
            count_zeroes++;
            // count Zeros  numbers
        }
        System.out.println("For Continue press 1 and For Exit press 0");
        choice = sc.nextInt();
    }while(choice!=0);
        // print positive numbers 
    System.out.println("The Positive Numbers are: " + count_positive);
        // print negative numbers
    System.out.println("The Negative Numbers are: " + count_negative);
        // print zeros;
    System.out.println("The Zeroes are: " + count_zeroes);
    }
}
