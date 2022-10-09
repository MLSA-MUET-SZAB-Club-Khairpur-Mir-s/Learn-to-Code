import java.util.*;
public class calcindex {
public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int ind=0;
    int exist = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the element");
    int element = sc.nextInt();
    for(int i=0; i<arr.length; i++)
    {
        if(element==arr[i]) {
            ind = i;
            exist = 1;
            break;
        }
    }
    
    if(exist==1){
    System.out.println("The index of the element is "+ ind );
    }
    else {
        System.out.println("Your entered element is not exist in the array");
    }










}
}