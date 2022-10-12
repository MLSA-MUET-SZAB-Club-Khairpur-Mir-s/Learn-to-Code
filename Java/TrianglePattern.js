// Java Program to print the Triangle pattern

import java.util.*; 

class TrianglePattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
 
        for (int i = 1; i <= rows; i++) {
 
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
 
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
             System.out.println();
        }
    }
}
