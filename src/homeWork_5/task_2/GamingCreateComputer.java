package homeWork_5.task_2;

public class GamingCreateComputer implements CreateComputerStrategy {


    @Override
    public Computer createComputer() {
        return ComputerFactory.createComputer(new GamingFactory());
    }
}
