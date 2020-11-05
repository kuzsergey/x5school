package homeWork_5.task_2;

public class Context {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Computer createComputerStrategy (){
        return strategy.createComputer();
    }
}
