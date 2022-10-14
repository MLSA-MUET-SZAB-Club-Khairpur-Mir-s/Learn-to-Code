// factorial of n number

public class FactorialOfNumberN {
    public static void main(String[]args){
       //Initializing and declaring Integer
        int n = 10;
        //Initializing integer factorial
        int facto = 1;
        for(int a = n; a>1; a--){
            facto *= a;
        }
        System.out.print(facto);
    }
}
