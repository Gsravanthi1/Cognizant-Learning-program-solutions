import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // Log error message
        logger.error("This is an error message");

        // Log warning message
        logger.warn("This is a warning message");
    }
}
