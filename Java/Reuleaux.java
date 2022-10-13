// Java Program to find the biggest Reuleaux triangle
// inscribed within in a square which in turn
// is inscribed within an equilateral triangle

class GFG
{
	
// Function to find the biggest reuleaux triangle
static float Area(float a)
{

	// side cannot be negative
	if (a < 0)
		return -1;

	// height of the reuleaux triangle
	float x = 0.464f * a;

	// area of the reuleaux triangle
	float A = 0.70477f * (float)Math.pow(x, 2);

	return A;
}

// Driver code
public static void main (String[] args)
{
	float a = 5;
	System.out.println(String.format("%.5f", Area(a)));
}
}

// This code is contributed by chandan_jnu
