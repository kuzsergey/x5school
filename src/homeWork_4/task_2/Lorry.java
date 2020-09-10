package homeWork_4.task_2;

public class Lorry extends Car {
    private double liftingСapacity;

    public Lorry(String model, String classOfCar, double weight, double powerMotor, String manufacturerMotor, double liftingСapacity) {
        super(model, classOfCar, weight, powerMotor, manufacturerMotor);
        this.liftingСapacity = liftingСapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка : " + this.model + ", класс : " + this.classOfCar + ", вес: " + this.weight + " кг, грузоподъемность: " +
                this.liftingСapacity + " кг, мощность мотора: " + this.motor.power + " кВт, производитель мотора: " +
                this.motor.manufacturer + ".");
        ;
    }
}
