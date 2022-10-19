import java.util.Scanner;

public class Calulator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         double num1, num2 , num3;
  
        // Take input from the user
        // Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
  
        // take the inputs
        num1 = sc.nextDouble();
  
        num2 = sc.nextDouble();

        num3 = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/)");
  
        char op = sc.next().charAt(0);
  
        double o = 0;
  
        switch (op) {
  
        // case to add three numbers
        case '+':
  
            o = num1 + num2 + num3;
  
            break;
  
        // case to subtract three numbers
        case '-':
  
            o = num1 - num2 - num3;
  
            break;
  
        // case to multiply three numbers
        case '*':
  
            o = num1 * num2 * num3;
  
            break;
  
        // case to divide three numbers
        case '/':
  
            o = num1 / num2 / num3;
  
            break;
  
        default:
  
            System.out.println("You enter wrong input");
  
            break;
        }

        // System.out.println("The final result:");
        // System.out.println();
        // print the final result
        
        System.out.println(num1 + " " + op + " " + num2
                           + " " + op + " " + num3 + " " + op + " = " + o);
    }
}