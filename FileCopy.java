import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("source.txt");
             OutputStream outputStream = new FileOutputStream("destination.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
