package homeWork_5.task_1;

public class Calculator {
    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public double add(double x, double y) {
        double result = x + y;
        String message = Double.toString(result);
        logger.log(message);
        return result;
    }

    public double sub(double x, double y) {
        double result = x - y;
        String message = Double.toString(result);
        logger.log(message);
        return result;
    }

    public double mul(double x, double y) {
        double result = x * y;
        String message = Double.toString(result);
        logger.log(message);
        return result;
    }

    public double div(double x, double y) {
        double result = x / y;
        String message = Double.toString(result);
        logger.log(message);
        return result;
    }

}
