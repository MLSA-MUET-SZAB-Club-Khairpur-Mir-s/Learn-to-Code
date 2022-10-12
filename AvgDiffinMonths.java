import java.util.Scanner;
import java.util.Scanner;
 
public class Exercise12 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int num3 = in.nextInt();
   
  System.out.print("Input fourth number: ");
  int num4 = in.nextInt();
  
  System.out.print("Enter fifth number: ");
  int num5 = in.nextInt();
   
   
  System.out.println("Average of five numbers is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5);
 }
}

public class Main {
 public static void main(String[] args) {
  double num = 0;
  double x = 1;
  Scanner sc = new Scanner(System.in);
  System.out.println("Input the number(n) you want to calculate the average: ");
  int n = sc.nextInt();
  while (x <= n) {
   System.out.println("Input number " + "("+ (int) x +")" + ":");
   num += sc.nextInt();
   x += 1;
  }
  double avgn = (num / n);

  System.out.println("Average:" + avgn);
 }
}
