package homeWork_4.task_2;

public abstract class Car {
    String model;
    String classOfCar;
    double weight;
    Engine motor;

    public Car(String model, String classOfCar, double weight, double powerMotor, String manufacturerMotor) {
        this.model = model;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.motor = new Engine(powerMotor, manufacturerMotor);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо.");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
