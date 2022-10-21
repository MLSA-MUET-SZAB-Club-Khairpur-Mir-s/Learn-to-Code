package Labs.Lab3;
import java.util.Scanner;
import java.util.Random;
public class RandomExample {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        Random rin = new Random();
        int arr[] = new int[15];
        String sarr[] = new String[5];
        int rannum1 = rin.nextInt(150)+1;
        int rannum2 = rin.nextInt(150)+1;
        int i = 0, ans=0;
        int j =0;
        while(i!=5){
            rannum1 = rin.nextInt(150)+1;
            arr[j] = rannum1; j++;
            rannum2 = rin.nextInt(150)+1;
            arr[j] = rannum2; j++;
            System.out.print("What is "+rannum1+" - "+rannum2+"?  :");
            ans = sin.nextInt();
            arr[j] = ans; j++;
            if(ans == (rannum1-rannum2)){
                System.out.println("Your answer is correct!");
                sarr[i] = "Correct!";
            }
            else{
                System.out.println("Your answer is wrong!");
                sarr[i] = "Wrong!";
            }
            i++;
        }
        System.out.println("********** RESULT **********");
        for(int atxi = 0,ely = 0; atxi < arr.length; ely++ ){
            System.out.print(arr[atxi]);
            atxi++;
            System.out.print(" - ");
            System.out.print(arr[atxi]);
            atxi++;
            System.out.print(" = ");
            System.out.print(arr[atxi]);
            atxi++;
            System.out.print(" "+sarr[ely]);
            System.out.println();
        }
    }
}
