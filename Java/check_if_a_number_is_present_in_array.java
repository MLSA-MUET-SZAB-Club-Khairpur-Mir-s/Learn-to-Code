import java.util.Random;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rt=new Random();
        int[] arr= new int [10];

        for (int i=0;i<10;i++){
            arr[i]=rt.nextInt(10);
        }

        System.out.println("Enter number that you want to search");
        int num=sc.nextInt();

        boolean present=false;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==num){
                present=true;
            }
        }
        if(present){
            System.out.println(num + "is present");
        }
        else {
            System.out.println(num+"is not present");
        }


    }
}
