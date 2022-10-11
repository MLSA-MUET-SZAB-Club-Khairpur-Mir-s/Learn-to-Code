public class Factorial {
    public static void main(String[] args) {
        int number = 6;
        long factorial = multiplyNumbers(number);
        System.out.println("Factorial of " + number + " = " + factorial);
    }
    public static long multiplyNumbers(int number){
        if (number >= 1)
            return number * multiplyNumbers(number - 1);
        else
            return 1;
    }
}
