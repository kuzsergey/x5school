package homeWork_4.task_2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Lorry("DAF", "грузовой", 7200, 410, "PACCAR", 30000),
        new SportCar("Ferrari","спорткар",1600,440,"Ferrari",315)};
        for (Car car : cars) {
            System.out.println("Информация об автомобиле: ");
            car.printInfo();
            car.start();
            car.turnRight();
            car.turnLeft();
            car.stop();
        }
    }
}
