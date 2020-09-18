package homeWork_5.task_2;

public class Context {
    private CreateComputerStrategy createComputerStrategy;

    public Context() {
    }

    public void setStrategy(CreateComputerStrategy createComputerStrategy) {
        this.createComputerStrategy = createComputerStrategy;
    }

    public Computer createComputer() {
        return createComputerStrategy.createComputer();
    }


}
