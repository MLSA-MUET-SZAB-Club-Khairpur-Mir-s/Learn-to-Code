public class Average {
    public static void main(String[] args) {
        double[] numArray1 = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;
        for (double num: numArray1) {
           sum += num;
        }
    

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}
