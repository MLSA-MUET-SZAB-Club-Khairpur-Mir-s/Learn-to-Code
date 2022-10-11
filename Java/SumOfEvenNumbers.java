
import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        System.out.println("How many numbers u wanna add");
        int n = sin.nextInt() , sum = 0;
        System.out.print("sum of numbers ");
        for(int a = 0; a<=n; a++){
            sum = sum +(2*a);
            System.out.printf(" %d ",2*a);
        }
        System.out.println("is "+sum);
    }
}
