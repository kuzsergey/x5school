package homeWork_5.task_2;

public class PowerfulCpuFactory extends CpuFactory {
    @Override
    public  Component create() {
        return new Cpu(4.5, 10, 19.25, "Core i9 10900X", "Intel");
    }
}
