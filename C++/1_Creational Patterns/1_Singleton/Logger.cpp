#include <iostream>

class Logger {
    private:
        static Logger* instance;
        Logger() {}  // private constructor to prevent instantiation

    public:
        static Logger* getInstance() {
            if (instance == NULL) {
                instance = new Logger();
            }
            return instance;
        }

        void log(std::string message) {
            // implementation of logging logic goes here
            std::cout << "Logging: " << message << std::endl;
        }
};

Logger* Logger::instance = 0;

int main() {
    Logger* logger = Logger::getInstance();

    logger->log("Starting MyApp");

    // application logic goes here

    logger->log("Shutting down MyApp");

    return 0;
}
