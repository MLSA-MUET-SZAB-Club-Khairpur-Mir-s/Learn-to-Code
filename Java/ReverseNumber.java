public class ReverseNumber {
    public static void main(String[] args) {
        int number = 987654321;
        int remainder=0 , reverse=0;
        
        // using condition 
        while(num!=0) {
            
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number/ 10;
        }
        System.out.println("The Reverse number is: " + reverse);
    }
}
