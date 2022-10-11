import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num){
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
