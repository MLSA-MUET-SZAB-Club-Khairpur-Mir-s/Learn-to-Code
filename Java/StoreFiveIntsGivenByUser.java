import java.util.*;
public class StoreFiveIntsGivenByUser {
    //Program to store 5 integers given by user in an array and finding largest number b/w them
    public static void main(String [] args) {
        System.out.println("Enter any 5 integers");
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        int c = inpt.nextInt();
        int d = inpt.nextInt();
        int e = inpt.nextInt();
        int[] arr = {a, b, c, d, e};
        int max = arr[0];
        for (int i=0;i< arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
