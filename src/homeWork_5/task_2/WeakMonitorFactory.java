package homeWork_5.task_2;

public class WeakMonitorFactory extends MonitorFactory {
    @Override
    public Component create() {
        return new Monitor("LG", 15);
    }
}
