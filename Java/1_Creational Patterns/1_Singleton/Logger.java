public class Logger {
    private static Logger instance = null;

    private Logger() {
        // private constructor to prevent instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        // implementation of logging logic goes here
        System.out.println("Logging: " + message);
    }
}

public class MyApp {
    private static final Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.log("Starting MyApp");

        // application logic goes here

        logger.log("Shutting down MyApp");
    }
}