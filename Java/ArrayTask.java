import java.util.*;
import java.util.stream.IntStream;
class ArrayTask{
  public static void main(String[] args){
  
   // declare and initialize variable 
    int[] number = new int[10] ;
    
    Scanner sc= new Scanner(System.in);
    for(int j =0; j<10; j++){
      number[j]= j;
    }
    System.out.print(" Enter the number :");
    int check = sc.nextInt();

    boolean found = false;

    for (int n : number){
      if (n == check){
        found = true;
        break;
      }
    }
    if(found)
      System.out.println(check + " is found.");
    else
      System.out.println(check + " is not found.");
      
  }
}
