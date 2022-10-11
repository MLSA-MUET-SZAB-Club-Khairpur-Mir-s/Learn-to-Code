public class swapwithoutusingthirdvariable {
    public static void main(String[] args) {
        int a = 10; 
        int b = 15;
        System.out.println("Before Swap: " + a + " " + b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After Swap: "+a + " "+ " " + b );
    }
}
