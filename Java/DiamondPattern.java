import java.util.Scanner;

public class DiamondPattern{
public static void main(String args[]){

  // declaring and initializing variables
int n, i, j, space = 1;
System.out.print(“Enter the number of rows: “);

//Taking input
Scanner s = new Scanner(System.in);
n = s.nextInt();


space = n – 1;
for (j = 1; j<= n; j++){
for (i = 1; i<= space; i++){
System.out.print(” “);
}

space–;

  // using for loop 
for (i = 1; i <= 2 * j – 1; i++){
System.out.print(“*”);
}

System.out.println(“”);
}

space = 1;

for (j = 1; j<= n – 1; j++){
for (i = 1; i<= space; i++){
System.out.print(” “);   // get space here
}

space++;

for (i = 1; i<= 2 * (n – j) – 1; i++){
System.out.print(“*”);
}

System.out.println(“”);
}
}
}
