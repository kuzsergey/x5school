package homeWork_4.task_2;

public abstract class Car {
    private String model;
    private String classOfCar;
    private double weight;
    private Engine motor;

    public Car(String model, String classOfCar, double weight, double powerMotor, String manufacturerMotor) {
        this.model = model;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.motor = new Engine(powerMotor, manufacturerMotor);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
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
