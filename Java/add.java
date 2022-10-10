import java.util.*;

public class add{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[][] a=new int[2][3];
        int[][] b=new int[2][3];
        int[][] result=new int[2][3];
        

        System.out.println("Enter first matrix data");
        for(int i=0;i<2;i++){ //rows
            for(int j=0;j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter second matrix data");
        for(int i=0;i<2;i++){ //rows
            for(int j=0;j<3;j++){
                b[i][j]= sc.nextInt();
            }
        }

        System.out.println("Printing first result");
        for(int i=0;i<2;i++){ //rows
            for(int j=0;j<3;j++){
               System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing Second result");
        for(int i=0;i<2;i++){ //rows
            for(int j=0;j<3;j++){
               System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing result after addition");
        for(int i=0;i<2;i++){ //rows
            for(int j=0;j<3;j++){
               result[i][j] = a[i][j] + b[i][j];
               System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
