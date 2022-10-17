
public class AvgCalculator {
    public static void main(String[]args){ 
       AvergeCalculator avergeCalculator=new AvergeCalculator(45,56,76);
       if(avergeCalculator.isExpert()){
           System.out.println("You are expert in these fields");
        else{
            System.out.println("Please try hard to atleast pass these subjects");
    }
}
class AvergeCalculator{
   private int marksInEnglish;
   private int marksInUrdu;
   private int markInProgramming;
    AverageCalculator(int marksInEnglish,int marksInUrdu,int markInProgramming){
        this.marksInEnglish=marksInEnglish;
        this.marksInUrdu=marksInUrdu;
        this.markInProgramming=markInProgramming;
    }
    public boolean isExpert(){
        double average=(marksInEnglish+marksInUrdu+markInProgramming);
        return (average>=40 && marksInEnglish>=35 && marksInUrdu>=35 && markInProgramming>=35);
    }
}
