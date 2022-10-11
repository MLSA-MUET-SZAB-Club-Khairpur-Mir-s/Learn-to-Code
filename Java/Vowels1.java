package Operators;
import java.util.Scanner;

class Vowels1 {
    String name;
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
    }
    public void Find_vowels()
    {
        int counter = 0;
        for(int i=0; i<name.length(); i++)
        {
            if(name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I' || name.charAt(i)=='O'|| name.charAt(i)=='U' || name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i' || name.charAt(i)=='o'|| name.charAt(i)=='u')
            {
                counter++;
            }
        }
        System.out.println("There are "+counter+" vowels in the name." );
    }
}
public class Vowels {
    public static void main(String[] args) {
        Vowels1 v1 = new Vowels1();
        v1.Input();
        v1.Find_vowels();

    }
}
