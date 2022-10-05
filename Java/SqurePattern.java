// Java Program to Print Square Pattern

import java.io.*;

class GFG {

	static void print_rectangle(int k, int l)
	{
		int a;
    int b;
    
		// Outer loop for rows
		for (a = 1; a <= k; a++) {
			// Inner loop for columns
			for (b = 1; b <= l; b++) {
				if (a == 1 || a == k || b == 1 || b == l)

					System.out.print("*");
				else

					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String args[])
	{
		int rows = 8;
    int columns = 22;

		// Calling the method
		print_rectangle(rows, columns);
	}
}
