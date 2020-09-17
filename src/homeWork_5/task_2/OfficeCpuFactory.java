package homeWork_5.task_2;

public class OfficeCpuFactory extends CpuFactory {
    @Override
    public  Component create() {
        return new Cpu(3.3,2,3,"Core i3 3220","Intel");
    }
}
