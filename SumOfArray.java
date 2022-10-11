package arraylab04;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        int myArray[] = new int [15];
        for(int i=0;i<myArray.length;i++) {
            myArray[i]=input.nextInt();
        }
        int sum = 0;
        for(int i:myArray) {
            sum+=i;
        }
        System.out.println(" Sum is Equal to : "+sum);
        System.out.println(" Average is Equal to : "+sum/myArray.length);
        input.close();
    }

}
