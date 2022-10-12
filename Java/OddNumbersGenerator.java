import java.util.Scanner;
public class OddNumbersGenerator {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);

        int n = 0;
        System.out.println("How Many ODD Numbers You wanna generate");
        n =sin.nextInt();
        for(int a=0; a<n; a++){
            System.out.print(2*a+1+" ");
        }
    }
}
