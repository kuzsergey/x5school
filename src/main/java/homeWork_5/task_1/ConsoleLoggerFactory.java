package homeWork_5.task_1;

public class ConsoleLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
