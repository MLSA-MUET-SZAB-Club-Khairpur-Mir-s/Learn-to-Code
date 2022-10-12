import java.util.Scanner;

public class Function {
//creating function
  static boolean elligibilitycheck(int age){
   if(age>18){
      return true;
   }else{
     return false;
   }
    }

    public static void main(String[] args) {
    //taking input
    Scanner sc=new Scanner(System.in);
    int age= sc.nextInt();
        System.out.print(elligibilitycheck(age));
    }
