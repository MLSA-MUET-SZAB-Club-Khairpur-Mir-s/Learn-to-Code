// Table of n number

import java.util.*;
public class TableOfNumberN {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        System.out.print("Table of ");
        int n = sin.nextInt();
        int s = 11 , f = 21 , g = 31 , h = 41;
        for(int a=1; a<=10; a++ , s++ , f++ , g++ , h++){
            System.out.println(n + " * " + a + " = " + n*a + "\t\t\t" + n + " * " + s + " = " + n*s + "\t\t\t" + n + " * " + f + " = " + n*f + "\t\t\t" + n + " * " + g + " = " + n*g + "\t\t\t" + n + " * " + h + " = " + n*h);
        }
    }
}
