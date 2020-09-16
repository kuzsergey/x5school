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
        System.out.println("Марка : " + this.getModel() + ", класс : " + this.getClassOfCar() + ", вес: " + this.getWeight() + " кг, грузоподъемность: " +
                this.liftingСapacity + " кг, мощность мотора: " + this.getMotor().getPower() + " кВт, производитель мотора: " +
                this.getMotor().getManufacturer() + ".");
        ;
    }
}
