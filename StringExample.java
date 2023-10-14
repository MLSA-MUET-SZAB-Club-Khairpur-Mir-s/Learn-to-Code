public class StringExample {
    public static void main(String[] args) {
        String message = "Java Programming";

        System.out.println("Original Message: " + message);
        System.out.println("Length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Substring: " + message.substring(5, 14));
        System.out.println("Reversed: " + new StringBuilder(message).reverse().toString());
    }
}
