import java.io.BufferedWriter;
import java.io.FileWriter;

public class ToFileWriter {
    private String filePath;
    public ToFileWriter(String filePath) {
        this.filePath = filePath;
    }
    public void writeToFile(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(message);
            writer.newLine();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
