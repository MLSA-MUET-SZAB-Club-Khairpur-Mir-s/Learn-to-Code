
import java.util.Scanner;
public class HiHelloWorldWithSwitchCase {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        int ans = sin.nextInt();
        switch (ans){
            case 1->System.out.println(" H e l l o  W o r l d! ");
            case 2->System.out.println("H i  W o r l d!");
        }   
    }
}
