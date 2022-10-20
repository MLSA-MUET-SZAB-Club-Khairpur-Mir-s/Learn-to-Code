
import java.util.Scanner;
public class FactorialBasedOnOperationMultiplicationSubtractionDivisionAddition {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        long n1, n2, result = 0, factorial = 1;
        char opt = 0;
        System.out.print(": ");
        n1 = sin.nextInt();
        System.out.print(": ");
        n2 = sin.nextInt();
        System.out.println("( + - * )");
        System.out.print(": ");
        opt = sin.next().charAt(0);
        switch (opt) {
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
        }
        if (result > 0) {
            do {
                factorial *= result;
                System.out.print(result + " ");
                result--;

                if (result != 0) {
                    System.out.print("* ");
                }
            }while (result != 0);
            System.out.println("= " + factorial);
        }
        else{
            do{
                factorial *=result;
                System.out.print(result+" ");
                result++;

                if(result!=0){
                    System.out.print("* ");
                }
            }while(result!=0);
            System.out.println("= "+(factorial));
        }
        sin.close();
    }
}
