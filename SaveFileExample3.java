import java.io.FileOutputStream;
import java.io.IOException;

public class SaveFileExample3 {
    public static void main(String[] args) {
        String data = "Saving binary data using FileOutputStream.";
        try (FileOutputStream fos = new FileOutputStream("output3.dat")) {
            fos.write(data.getBytes());
            System.out.println("Binary file saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
