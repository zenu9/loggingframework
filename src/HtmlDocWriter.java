import java.io.BufferedWriter;
import java.io.FileWriter;

public class HtmlDocWriter {
    private String htmlFilePath;
    public HtmlDocWriter(String htmlFilePath) {
        this.htmlFilePath = htmlFilePath;
    }
    public void writeToHtml(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFilePath, true))) {
            writer.write("<!DOCTYPE html>");
            writer.newLine();
            writer.write("<html lang=\"en\">");
            writer.newLine();
            writer.write("<head>");
            writer.newLine();
            writer.write("<meta charset=\"UTF-8\">");
            writer.newLine();
            writer.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            writer.newLine();
            writer.write("<title>Document</title>");
            writer.newLine();
            writer.write("</head>");
            writer.newLine();
            writer.write("<body>");
            writer.newLine();
            writer.write("<p>" + message + "</p>");
            writer.newLine();
            writer.write("</body>");
            writer.newLine();
            writer.write("</html>");
            writer.newLine();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
