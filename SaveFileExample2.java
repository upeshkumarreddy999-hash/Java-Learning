import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFileExample2{
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output2.txt"))) {
            bw.write("This text is saved using BufferedWriter.");
            bw.newLine();
            bw.write("BufferedWriter is efficient for multiple lines.");
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
