
import  java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[]args){
//        1.Write a code to handle ArithmeticException and IndexOutOfboundsException
        Scanner sin = new Scanner(System.in);
        int arr[] = new int[5];
        arr[0] = 3;
        arr[1] = 14;
        arr[2] = 74;
        arr[3] = 42;
        arr[4] = 34;
        System.out.println();
        int a = 0;
        while(a<=5){
            a++;
            try{
                System.out.print("Enter the index : "); int ind = sin.nextInt(); // get index
                System.out.println(arr[ind]);                                    // number at the index
                System.out.print("Divide with : "); int num = sin.nextInt();
                System.out.println(arr[ind]/num);                                // number that divides
            }
            catch (ArithmeticException e){
                System.out.println(e);               // if number is zero divided pr other exception
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);              // if index is out of bound
            }
        }
    }
}
