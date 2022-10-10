public class Hollow_Square {
	public static void HollowSquare(int a) {
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				if(i==1||i==a||j==1||j==a) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		HollowSquare(4); //to test the code
	}

}
