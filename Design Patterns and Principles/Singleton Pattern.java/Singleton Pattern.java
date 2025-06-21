public class Logger {
    // Step 1: Private static instance of the same class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Public method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Create only if not already created
        }
        return instance;
    }

    // Logger method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
// SingletonTest.java
public class SingletonTest {
    public static void main(String[] args) {
        // Try to get Logger instances
        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        // Verify both logger instances are same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances!");
        }
    }
}
