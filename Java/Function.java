import java.util.Scanner;

public class Function {
 //greateroftwonumbers
 static void greaterOfTwo(int a,int b){
       if (a>b){
            System.out.print(a+" is greater.");
        }else if(a<b){
            System.out.print(b+" is greater.");
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
