import java.util.Scanner;
public class LargestandSmallest {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int terminated;
        do{
            System.out.println("Enter the number ");
            int x = sc.nextInt();
            if(x<smallest) {
                smallest=x;
            }
            if(x>largest){
                largest=x;
            }
            System.out.println("If you want to continue this process then press 1 otherwise press 0");
            terminated = sc.nextInt();
        }while(terminated!=0);
        System.out.println("The Smallest value is: " + smallest);
        System.out.println("The Largest value is: " + largest);
    }
}

