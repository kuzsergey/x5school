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
        System.out.println("Марка : " + this.getModel() + ", класс : " + this.getClassOfCar() + ", вес: " + this.getWeight() + " кг, максимальная скорость: " +
                this.topSpeed + " км/ч, мощность мотора: " + this.getMotor().getPower() + " кВт, производитель мотора: " +
                this.getMotor().getManufacturer() + ".");
    }
}
