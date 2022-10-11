
import java.util.Scanner;
public class ReverseNumbersPrint {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        for(int a = n; a >= 1; a--){
            System.out.print(a+" ");
        }
    }
}
