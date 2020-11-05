package homeWork_5.task_2;

public class Main {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer gamingComputer = computerFactory.create(TypeComputer.Gaming);
        gamingComputer.turnOn();
        Computer officeComputer = computerFactory.create(TypeComputer.Office);
        officeComputer.turnOn();


    }
}
