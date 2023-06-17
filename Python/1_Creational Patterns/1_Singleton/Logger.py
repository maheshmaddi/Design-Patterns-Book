class Logger:
    __instance = None

    @staticmethod
    def getInstance():
        if Logger.__instance == None:
            Logger()
        return Logger.__instance

    def __init__(self):
        if Logger.__instance != None:
            raise Exception("This class is a singleton!")
        else:
            Logger.__instance = self

    def log(self, message):
        # implementation of logging logic goes here
        print("Logging: " + message)


class MyApp:
    logger = Logger.getInstance()

    @staticmethod
    def main():
        MyApp.logger.log("Starting MyApp")

        # application logic goes here

        MyApp.logger.log("Shutting down MyApp")


if __name__ == "__main__":
    MyApp.main()
