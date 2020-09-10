package homeWork_4.task_2;

public class SportCar extends Car {
    private double topSpeed;

    public SportCar(String model, String classOfCar, double weight, double powerMotor, String manufacturerMotor, double topSpeed) {
        super(model, classOfCar, weight, powerMotor, manufacturerMotor);
        this.topSpeed = topSpeed;
    }


    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");

    }

    @Override
    public void printInfo() {
        System.out.println("Марка : " + this.model + ", класс : " + this.classOfCar + ", вес: " + this.weight + " кг, максимальная скорость: " +
                this.topSpeed + " км/ч, мощность мотора: " + this.motor.power + " кВт, производитель мотора: " +
                this.motor.manufacturer + ".");
    }
}
