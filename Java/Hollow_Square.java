public class Hollow_Square {
	public static void HollowSquare(int x) {
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=x; j++) {
				if(i==1||i==x||j==1||j==x) {
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
