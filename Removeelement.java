import java.util.Arrays;
import java.util.Scanner; 
public class Removeelement{
 
public static void main(String[] args) {
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter index that you want to delete element");
   int removeIndex = sc.nextInt();
   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
    System.out.println("After removing the element from array: "+Arrays.toString(my_array));
 }
 }

