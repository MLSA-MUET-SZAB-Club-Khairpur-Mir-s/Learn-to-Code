import java.util.Random;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Random rt=new Random();
     int [] arr=new int[10];

     for (int i=0;i<10;i++){
         arr[i]=rt.nextInt(50);
     }
        System.out.println("Elements before Sorting:");
     for (int x:arr){
         System.out.print(x+" ");
     }
        for (int i=0;i<10;i++){
            for (int j=i+1;j<10;j++){
                if (arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;


                }
            }
        }
        System.out.println();

        System.out.print("The elements after sorting: ");
        System.out.println();
             for(int x:arr){
                 System.out.print(x+" ");
             }

    }
}
