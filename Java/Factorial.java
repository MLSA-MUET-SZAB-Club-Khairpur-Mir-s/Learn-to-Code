public class Factorial {
    public static void main(String[] args) {
        int num = 6;//Initializing a variable.
        long factorial = multiplyNumbers(num);
        //Printing output.
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num){
        //Setting a condition.
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
