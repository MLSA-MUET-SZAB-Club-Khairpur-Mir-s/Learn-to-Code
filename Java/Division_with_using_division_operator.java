import java.util.Scanner;

public class Division_with_using_division_operator {
    public static void main(String[] args) {
        int counter = 0;
        int point = 10;
        int pcounter = 0;

        System.out.println("Enter dividend : ");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();

        int divisor;
        System.out.println("Enter divisor : ");
        for(divisor = sc.nextInt(); dividend > divisor; ++counter) {
            dividend -= divisor;
        }

        if (dividend == divisor) {
            System.out.println(counter + 1);
        } else {
            System.out.print("" + counter + ".");
        }

        for(int i = 1; i <= 3; ++i) {
            if (dividend < divisor) {
                for(dividend *= point; dividend > divisor; ++pcounter) {
                    dividend -= divisor;
                }

                System.out.print(pcounter);
                pcounter = 0;
            }
        }
    }
}
