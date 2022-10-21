import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 987654321;
        int rem=0 , rev=0;
        //reversing anumber
        while(num>0) {

            
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/ 10;
        }
        System.out.println("The Reverse number is: " + reverse);
    }
}
