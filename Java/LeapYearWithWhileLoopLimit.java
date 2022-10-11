
import java.util.Scanner;
public class LeapYearWithWhileLoopLimit {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        int year = 0, limiter=0;
        boolean flag= false;
        do {
            System.out.print("Enter Year: ");
            year = sin.nextInt();

            if (year % 400 == 0) {
                flag = true;
            } else if (year % 100 == 0) {
                flag = false;
            } else if (year % 4 == 0) {
                flag = true;
            } else {
                flag = false;
            }
            if (flag) {
                System.out.printf("Your Entered Year %d is Leap Year", year);
            } else {
                System.out.printf("Your entered year %d is Nawt Leap Year", year);
            }
            System.out.println();
            System.out.print("D'ya Wanna Continue..."+"\n1.Yes"+"\n2.No"+"\n");
            limiter = sin.nextInt();
        }while(limiter==1);
        System.out.print("Thanks For Using Our lEap YEar Program");
    }
}
