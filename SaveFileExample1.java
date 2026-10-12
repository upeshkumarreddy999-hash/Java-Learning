import java.io.FileWriter;
import java.io.IOException;

public class SaveFileExample1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output1.txt");
            writer.write("Hello, this is saved using FileWriter!");
            writer.close();
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
