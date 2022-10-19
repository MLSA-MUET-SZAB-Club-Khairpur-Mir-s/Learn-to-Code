
import java.util.Scanner;
public class GPACalculatorOfASemester {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter Your Roll Number\n:");
        String rollNo = sin.nextLine();
        System.out.print("Enter Your Name\n:");
        String name = sin.nextLine();
        System.out.println("Student Roll No: "+rollNo);
        System.out.println("Name of Student: "+name);
        System.out.println("Subjects");
        System.out.println("English ");
        System.out.print("Obtained : ");
        int englishObtained = sin.nextInt();
        System.out.print("Outta : ");
        int englishOutta = sin.nextInt();

        System.out.println("Programming Theory ");
        System.out.print("Obtained : ");
        int programmingTheoryObtained = sin.nextInt();
        System.out.print("Outta ");
        int programmingTheoryOutta = sin.nextInt();

        System.out.println("Programming Practical : ");
        System.out.print("Obtained : ");
        int programmingPracticalObtained = sin.nextInt();
        System.out.print("Outta : ");
        int programmingPracticalOutta = sin.nextInt();

        System.out.println("AppliedCalculus ");
        System.out.print("Obtained : ");
        int ACObtained = sin.nextInt();
        System.out.print("Outta : ");
        int ACOutta = sin.nextInt();

        System.out.println("Applied Physics");
        System.out.print("Obtained : ");
        int APObtained = sin.nextInt();
        System.out.print("Ouuta : ");
        int APOutta = sin.nextInt();

        System.out.println("IICT Theory: ");
        System.out.print("Obtained : ");
        int IICTTheoryObtained = sin.nextInt();
        System.out.print("Outta : ");
        int IICTTheoryOutta = sin.nextInt();

        System.out.println("IICT Practical: ");
        System.out.print("Obtained : ");
        int IICTPracticalObtained = sin.nextInt();
        System.out.print("Outta : ");
        int IICTPracticalOutta = sin.nextInt();

        int totalObtainedMarks = englishObtained + programmingTheoryObtained + programmingPracticalObtained + ACObtained + APObtained + IICTTheoryObtained + IICTPracticalObtained;
        int totalMarks = englishOutta + programmingTheoryOutta + programmingPracticalOutta + ACOutta + APOutta + IICTTheoryOutta + IICTPracticalOutta;
        double Percentage = totalObtainedMarks * 100 /totalMarks ;
        System.out.println(" Total Marks " + totalMarks);
        System.out.println("Obtained Marks : " + totalObtainedMarks );
        System.out.println("Percentage : " + Percentage);
        if(Percentage >= 91)
        {
            System.out.println("CGPA : Grade A+");
        }
        else if(Percentage >= 83)
        {
            System.out.println("CGPA : Grade A");
        }
        else if(Percentage >= 75)
        {
            System.out.println("CGPA : Grade B+");
        }
        else if(Percentage >= 65)
        {
            System.out.println("CGPA : Grade B");
        }
        else if(Percentage >= 60)
        {
            System.out.println("CGPA : Grade C+");
        }
        else if(Percentage >= 50)
        {
            System.out.println("CGPA : Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

