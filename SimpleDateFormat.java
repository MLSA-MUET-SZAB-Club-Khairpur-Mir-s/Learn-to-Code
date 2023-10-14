import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Current Date and Time: " + formattedDate);
    }
}
