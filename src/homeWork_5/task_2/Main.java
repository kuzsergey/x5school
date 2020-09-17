package homeWork_5.task_2;

public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.createComputer(TypeComputer.Gaming);
        computer.turnOn();
    }
}
