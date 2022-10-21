import java.util.Scanner;

class Vowels {
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
        System.out.println("In name there are "+counter+" vowels" );
    }
}
public class CountVowels {
    public static void main(String[] args) {
        Vowels v1 = new Vowels();
        v1.Input();
        v1.Find_vowels();

    }
}
