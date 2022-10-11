import java.util.Scanner;
public class GettingUserInput {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        System.out.print("Your Entered Number ");
        boolean tOrf= sin.hasNextInt();
        if(tOrf)
        System.out.print(" is Int");
        else{
            System.out.print(" is Not Int");
        }
    }
}
