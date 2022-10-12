import java.util.Random;
import java.util.Scanner;

class RandomQuestions{
    public static void main(String[] args) {
        Random r1 = new Random();
        Scanner sc = new Scanner(System.in);
        int count_correct=0 , count_wrong=0;
        int num1=0, num2=0, input=0;
        for(int i=1; i<=5; i++) {
        num1 = r1.nextInt(20);
        num2 = r1.nextInt(20);
        System.out.println("What is " + num1 + " - " + num2 + " ? ");
        input = sc.nextInt();
        int sub = num1-num2;
        if(sub==input) {
            System.out.println("The Answer is Correct: ");
            count_correct++;
        }
        else {
            System.out.println("The Answer is Wrong");
            System.out.println(num1+" - "+num2 + " should  be " + (num1-num2));
            count_wrong++;
        }
        }
        System.out.println();
        System.out.println("The Correct Answers are: " + count_correct);
        System.out.println("The Wrong Answers are: " + count_wrong);
        
    }
}