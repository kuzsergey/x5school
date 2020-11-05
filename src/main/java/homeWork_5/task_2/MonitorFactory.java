package homeWork_5.task_2;

public class MonitorFactory implements ComponentFactory {
    @Override
    public Component create() {
        return new Monitor("SAMSUNG", 22);
    }
}
