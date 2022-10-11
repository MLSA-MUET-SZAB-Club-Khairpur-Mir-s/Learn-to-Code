import java.util.Scanner;
public class XPowerN {
    public static int calculate(int x , int n)
    {
        if(n==0) {
            return 1;
        }
         if (x==0) {
            return 0;
        }
        int xpower = x * calculate(x, n-1);
        return xpower;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
       int x = sc.nextInt();
        System.out.println("Enter the power");
       int n = sc.nextInt();
        int ans = calculate(x,n);
        System.out.println( x+ " to "+ "Power " + n + " is " + ans);
        }
 }
