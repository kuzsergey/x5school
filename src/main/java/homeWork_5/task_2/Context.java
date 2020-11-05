package homeWork_5.task_2;

public class Context {
    Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    Computer createComputerStrategy (){
        return strategy.createComputer();
    }
}
