import java.util.Scanner;
public class SimpleByteUse {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        byte numb = sin.nextByte();
        switch(numb){
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
        }
    }
}
