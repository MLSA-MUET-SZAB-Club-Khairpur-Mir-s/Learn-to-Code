
import java.util.Scanner;
public class CalculatorWithAllControlSatetments {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print(": ");
        int n1 = sin.nextInt();
        System.out.print(": ");
        int n2 = sin.nextInt();
        System.out.println("( + - * / )");
        char opt = sin.next().charAt(0);
        System.out.print("Continue with\n1.if-else\n2.switch case\n:");
        int ans = sin.nextInt();
        switch (ans) {
            case 1 -> {
                switch (opt) {
                    case '+' -> System.out.println("Sum: " + (n1 + n2));
                    case '-' -> System.out.println("Subtraction: " + (n1 - n2));
                    case '*' -> System.out.println("Product: " + (n1 * n2));
                    case '/' -> System.out.println("Division: " + (n1 / n2));
                }
            }
            case 2 -> {
                if (opt == '+') {
                    System.out.println("Sum: " + (n1 + n2));
                }
                if (opt == '-') {
                    System.out.println("Subtraction: " + (n1 - n2));
                }
                if (opt == '*') {
                    System.out.println("Product: " + (n1 * n2));
                }
                if (opt == '/') {
                    System.out.println("Division: " + (n1 / n2));
                }
            }
        }
    }
}
