import java.util.Scanner;
//importing scanner class
public class Calculator {
  public static void main(String[] args) {
    // Initializing character 
    char operator;
    //Initializing Numbers and result
    int  number1, number2, result;


    Scanner input = new Scanner(System.in);
    // Taking input from user for operator and number

    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    System.out.println("Enter first number");
    number1 = sc.nextDouble();

    System.out.println("Enter second number");
    number2 = sc.nextDouble();


    switch (operator) {
    case '+':
        result = number1 + number2;
        System.out.printf("\n%d + %d = %d ",number1,number2,result);
        break;
    case '-':
        result = number1 - number2;
        System.out.printf("\n%d - %d = %d ",number1,number2,result);
        break;
    case '*':
        result = number1 * number2;
        System.out.printf("\n%d x %d = %d ",number1,number2,result);
        break;
    case '/':
        result = number1 / number2;
        System.out.printf("\n%d + %d = %d ",number1,number2,result);
        break;
           case '%':
        result = number1 % number2;
        System.out.printf("\n%d + %d = %d ",number1,number2,result);
        break;
        case '!':
        //function to find the power of a number  
        static int power(int base, int exponent)  
       {  
        int power = 1;  
       //increment the value of i after each iteration until the condition becomes false  
        for (int i = 1; i <= number2; i++)   
          //calculates power  
        power = power * number1;  
        //returns power  
        return power;  
}  

        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
    default:
        System.out.println("Invalid operator!");
        break;
    }

    sc.close();
  }
}
