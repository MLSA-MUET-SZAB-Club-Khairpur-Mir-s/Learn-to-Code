import java.util.*;
import java.util.stream.IntStream;

class ArrayTask{
  public static void main(String[] args){
    
    int[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    Scanner sc= new Scanner(System.in);
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
