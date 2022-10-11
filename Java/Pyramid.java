public class Pyramid

{

public static void PyramidPattern(int n)

{

for (int i=0; i<n; i++) // for number of rows(n)

{ for (int j=n-i; j>1; j–) // a loop for spaces

{

System.out.print(” “); //to print space

}

for (int j=0; j<=i; j++ ) //for number of columns

{

System.out.print(“* “); //to print star

}

System.out.println(); //end-line after every row

}

}

public static void main(String args[]) //driver function,

{

int n = 5;

PyramidPattern(n);

}

}
