public class Pyramid2 {

  public static void main(String[] args) {
    int rows = 5;
      //Outer Loop 
    for (int i = 1; i <= rows; ++i) {
      //Inner Loop
      for (int j = 1; j <= i; ++j) {
        System.out.print("*");
      
      }
      System.out.println();
    }
  }
}
