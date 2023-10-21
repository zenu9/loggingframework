public class HtmlLoggerAdapter implements Logger {
    private HtmlDocWriter htmlWriter;
    public HtmlLoggerAdapter(HtmlDocWriter htmlWriter) {
        this.htmlWriter = htmlWriter;
    }
    @Override
    public void logMessage(String message) {
        htmlWriter.writeToHtml(message);
    }
}
