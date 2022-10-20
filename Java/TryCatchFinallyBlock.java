
import java.util.Scanner;
public class TryCatchFinallyBlock {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sin = new Scanner(System.in);
        System.out.print("Num1 : ");
        int num1 = sin.nextInt();
        System.out.print("Num2 : ");
        int num2 = sin.nextInt();
        try {
            String msg = "Division";
            if(num2==0) {
                throw new Exception("ArithmeticException");
            }
            System.out.println(num1/num2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Block");
        }
    }
}
