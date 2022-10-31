
import java.util.Scanner;
public class SmallerAndBiggerNumber {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        System.out.print(": ");
        int size = sin.nextInt();
        int arr[] = new int[size];
        for(int a = 0; a < arr.length; a++ ){
            System.out.print(": ");
            arr[a] = sin.nextInt();
        }
        int a = 0;
        int smallest = 2345678;
        int biggest = 0;
        while(a<arr.length){
            if(arr[a]<smallest){
                smallest = arr[a];
            }
            if(arr[a]>biggest){
                biggest = arr[a];
            }
            a++;
        }
        System.out.println("Smallest  number is: "+smallest);
        System.out.println("Bigget  number is: "+biggest);
    }
}
