
import java.util.Scanner;
public class AvgCalculator {
    public static void main(String[]args){
        // using Input 
        Scanner sin = new Scanner (System.in);
        byte s1 , s2 , s3;
        System.out.println("Enter Your Marks in English");
        s1=sin.nextByte();
        System.out.println("Enter Your Marks in Urdu");
        s2 = sin.nextByte();
        System.out.println("Enter Your Marks in Programming");
        s3=sin.nextByte();
        float avg = (s1+s2+s3)/3.0f;
        System.out.printf("Average is %f \n", avg);
        if(avg>=40 && s1>=35 && s2>=35 && s3>=35){
            System.out.print("You are Expert in These Subs");
        }
        // using condition
        else{
            System.out.print("Loser!");
        }
    }
}
