public class Average {
    public static void main(String[] args) {
        double[] numArray = { 45.4, 67.6, -45.4, 20.33, 33.1, 45.4 };
        double count = 0.0;
        for (double num: numArray) {
           count += num;
        }
    

        double average = count / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}
