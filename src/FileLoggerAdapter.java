import java.io.FileWriter;

public class FileLoggerAdapter implements Logger {
    private ToFileWriter fileWriter;
    public FileLoggerAdapter(ToFileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
    @Override
    public void logMessage(String message) {
        fileWriter.writeToFile(message);
    }
}
