package homeWork_5.task_2;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = ComputerFactory.createComputer(TypeComputer.Gaming);
        Computer computer2 = ComputerFactory.createComputer(TypeComputer.Office);
        computer1.turnOn();
        System.out.println();
        computer2.turnOn();
    }
}
