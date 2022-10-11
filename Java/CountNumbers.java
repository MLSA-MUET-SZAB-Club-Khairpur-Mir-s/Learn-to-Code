import java.util.Scanner;
public class CountNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, count_negative=0,count_zeroes=0, count_positive = 0, choice =0;
    do {
        //Taking input from user
        System.out.println("Enter the number :");
        n = sc.nextInt();
        //Checking if input is greater than zero then it must be a positive number.
        if(n>0) {
            //Setting a counter to count positive numbers.
        count_positive++;  
        }
        //If input is less than zero then it must be a negative number.
        else if (n<0) {
            //Setting a counter to count negative numbers.
            count_negative++;
        }
        //If input is not a positive or negative number then it is zero.
        else {
            //Setting a counter to count zeros.
            count_zeroes++;
        }
        System.out.println("For Continue press 1 and For Exit press 0");
        choice = sc.nextInt();
    }while(choice!=0);
        //Setting a condition that if the user wants to check for more than one number.
        //Printing the result.
    System.out.println("The Positive Numbers are: " + count_positive);
    System.out.println("The Negative Numbers are: " + count_negative);
    System.out.println("The Zeroes are: " + count_zeroes);
    }
}
