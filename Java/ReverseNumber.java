public class ReverseNumber {
    public static void main(String[] args) {
        int num = 987654321;
        int rem=0 , rev=0;
        while(num!=0) {
            
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num/ 10;
        }
        System.out.println("The Reverse number is: " + rev);
    }
}
