/*
 *
 *
 */
public class EndsWithExample {

    public boolean endsWith(String suffix) {
        return startsWith(suffix, value.length - suffix.value.length);
    }
    public static void main(String args[]) {
        String s1 = "coding coding";
        System.out.println(s1.endsWith("ing"));
        System.out.println(s1.endsWith("dummy"));
    }
}
