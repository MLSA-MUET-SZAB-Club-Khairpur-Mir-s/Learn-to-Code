import java.util.Arrays;
import java.util.Scanner; 
 public class Evenoddarray {
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int[] array_nums = new int[10];
    System.out.println("Enter the  numbers in an array: ");
    for(int i = 0; i < array_nums.length; i++)
	{
		array_nums[i] = sc.nextInt();
	}
	System.out.print("Original Array: "+Arrays.toString(array_nums)); 
	int ctr = 0;
	for(int i = 0; i < array_nums.length; i++)
	{
		if(array_nums[i] % 2 == 0)
			ctr++;
	}
	System.out.println("Number of even numbers : "+ctr);
	System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
 }
}