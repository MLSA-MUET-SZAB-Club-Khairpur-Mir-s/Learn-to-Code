import java.util.Scanner;
public class IfElseAndSwitchCaseControlStatements {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        System.out.println("Hello");
        System.out.print("Are You Ready For This Program\n1.Yes\n2.No\n:");
        int ans = sin.nextInt();
        switch (ans){
            case 1 ->{ System.out.println("Nice");
                System.out.print("How Old are you?\n:");
                int age = sin.nextInt();
                if(age>0 && age<=7 ){
                    System.out.println("new Born Baby");
                } else if (age>=8 && age <=14) {
                    System.out.println("Grow Up");
                } else if (age>=15 && age <= 18) {
                    System.out.println("Oh Ho Lover Boy");
                } else{
                    System.out.println("You are old guy");
                }
            }
            case 2 -> System.out.println("Bedder Luck Next Time");
        }

    }
}
