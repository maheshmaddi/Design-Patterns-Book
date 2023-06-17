public sealed class Logger {
    private static Logger instance = null;
    private static readonly object padlock = new object();

    Logger() {
        // private constructor to prevent instantiation
    }

    public static Logger Instance {
        get {
            lock (padlock) {
                if (instance == null) {
                    instance = new Logger();
                }
                return instance;
            }
        }
    }

    public void Log(string message) {
        // implementation of logging logic goes here
        Console.WriteLine("Logging: " + message);
    }
}

class MyApp {
    private static readonly Logger logger = Logger.Instance;

    static void Main(string[] args) {
        logger.Log("Starting MyApp");

        // application logic goes here

        logger.Log("Shutting down MyApp");
    }
}
