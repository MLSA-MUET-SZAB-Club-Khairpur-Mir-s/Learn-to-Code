//Java program with overloaded main()
import java.io.*;
public class Test
{
// First main method which is created
public static void main(String[] args)
{
System.out.println("Main function called");
Test.main("Everyone");
}
// First overloaded main method
public static void main(String ar1)
{
System.out.println("Hi, " + ar1);
Test.main("Hello Everyone", "Buenos dias");
}
//Second overloaded main method
public static void main(String ar1, String ar2)
{
System.out.println("Mi todo eres tu, " + ar1 + ", " + ar2);
}
}
