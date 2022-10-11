package love_from_unlimited_practice;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        //A year containing an extra day. It has 366 days.
        //instead of the normal 365 days.
        //The extra day is added in February, which has 29
        //days instead of the normal 28 days.
        //Leap years occur every 4 years. 2020 is a leap
        //year and so is 2024.
        //Except that every 100 years special rules apply. For example 1900 was not a leap year,
        //but 2000 was.
       int year = sin.nextInt();
       boolean flag;
       if(year%400==0){
           flag = true;
       }
       else if(year%100==0){
           flag = false;
       }
       else if(year%4==0){
           flag = true;
       }
       else{
           
       }
    }
}
