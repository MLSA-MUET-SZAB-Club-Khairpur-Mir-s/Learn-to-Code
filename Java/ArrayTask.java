import java.util.*;
import java.util.stream.IntStream;
/kku
class ArrayTask{
  public static void main(String[] args){
  
    
    int[] num = new int[10] ;
    
    Scanner sc= new Scanner(System.in);
    for(int i =0; i<10; i++){
      num[i]= i;
    }
    System.out.print(" Enter the number :");
    int check = sc.nextInt();

    boolean found = false;

    for (int n : num){
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
