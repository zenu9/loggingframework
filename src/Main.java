public class Main {
    public static void main(String[] args) {
        Logger logger = new HtmlLoggerAdapter(new HtmlDocWriter("C:\\Users\\mugiwara\\Documents" +
                "\\Design Patterns\\LoggingFramework\\src\\log.html"));
        logger.logMessage("Hello! This is my third assignment!");

        logger = new FileLoggerAdapter(new ToFileWriter("C:\\Users\\mugiwara\\Documents" +
                "\\Design Patterns\\LoggingFramework\\src\\log.txt"));
        logger.logMessage("Hello! This is my third assignment!");

        logger = new ConsoleLogger();
        logger.logMessage("Hello! This is my third assignment!");
    }
}