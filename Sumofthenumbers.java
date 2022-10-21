import java.util.Scanner;
public class sumofthenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int x;
       
        System.out.println();
        do {
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            x = sc.nextInt();
            sum+=x;
        }while(x!=0);
        System.out.println("The sum is: " + sum);
    }
}
