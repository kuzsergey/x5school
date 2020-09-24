package homeWork_5.task_1;

public class ConsoleLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Log into console: " + message);
    }
}
