import java.util.Scanner;

public class factorial {
    public static int calcfact(int n)
    {
        if(n==1 || n==0) {
            return 1;
        }
        int fact = n * calcfact (n-1);
        return fact;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find the factorial");
    int n = sc.nextInt();
    System.out.print("The factorial of the number is ");
    System.out.print(calcfact(n));
}
    
}