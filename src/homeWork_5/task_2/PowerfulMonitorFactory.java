package homeWork_5.task_2;

public class PowerfulMonitorFactory extends MonitorFactory {
    @Override
    public Component create() {
        return new Monitor("SAMSUNG",27);
    }
}
