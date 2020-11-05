package homeWork_5.task_1;

public class Main {
    public static void main(String[] args) {
        LoggerFactory consoleLoggerFactory = new  ConsoleLoggerFactory();
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        LoggerFactory dbLoggerFactory = new DbLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        Logger fileLogger = fileLoggerFactory.createLogger();
        Logger dbLogger = dbLoggerFactory.createLogger();

        Calculator calculator1 = new Calculator(consoleLogger);
        calculator1.add(2,6);
        calculator1.sub(5,8);
        calculator1.mul(5,8);
        calculator1.div(10,2);

        Calculator calculator2 = new Calculator(fileLogger);
        calculator2.add(2,6);
        calculator2.sub(5,8);
        calculator2.mul(5,8);
        calculator2.div(10,2);

        Calculator calculator3 = new Calculator(dbLogger);
        calculator3.add(2,6);
        calculator3.sub(5,8);
        calculator3.mul(5,8);
        calculator3.div(10,2);
    }
}
