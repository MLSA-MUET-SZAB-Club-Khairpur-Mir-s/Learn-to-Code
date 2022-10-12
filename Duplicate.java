import java.util.Arrays;
import java.util.Scanner; 
public class Duplicate {
  public static void main(String[] args) 
    {
        int my_array[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of an array:");
        for(int i = 0; i < 10; i++) {
            my_array[i] = sc.nextInt();
        }
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element are:  "+my_array[j]);
                }
            }
        }
    }    
}