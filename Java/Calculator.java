import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    char operator;
    int  number1, number2, result;

    Scanner input = new Scanner(System.in);
    
    System.out.print("\nChoose an operator: +, -, *, or / : ");
    operator = input.next().charAt(0);

    System.out.print("\nEnter the first number : ");
    number1 = input.nextDouble();

    System.out.print("\nEnter the second number : ");
    number2 = input.nextDouble();

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
    default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
