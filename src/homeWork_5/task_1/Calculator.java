package homeWork_5.task_1;

public class Calculator {
    public static double add(double x, double y) {
        double result = x + y;
        logger(result);
        return result;
    }

    public static double sub(double x, double y) {
        double result = x - y;
        logger(result);
        return result;
    }

    public static double mul(double x, double y) {
        double result = x * y;
        logger(result);
        return result;
    }

    public static double div(double x, double y) {
        double result = x / y;
        logger(result);
        return result;
    }

    public static void logger(double result) {
        String resultString = Double.toString(result);
        LoggerFactory[] loggerFactories = {
                new ConsoleLoggerFactory(),
                new FileLoggerFactory(),
                new DbLoggerFactory()
        };
        for (LoggerFactory loggerFactory : loggerFactories) {
            loggerFactory.createLogger().log(resultString);
        }
    }

}
