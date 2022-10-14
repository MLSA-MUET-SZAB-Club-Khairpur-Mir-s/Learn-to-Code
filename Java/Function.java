import java.util.Scanner;

public class Function {
 //greateroftwonumbers
 static void greaterOfTwo(int a,int b){
  //Checking Condition for the greater number
       if (a>b){
            System.out.print(a+" is greater.");
        //Checking Condition for Less number
        }else if(a<b){
            System.out.print(b+" is greater.");
        //If both condition don't match or are equal
        }else {
            System.out.println("both are equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        greaterOfTwo(a,b);
    }
