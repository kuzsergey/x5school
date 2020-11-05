package homeWork_5.task_2;
public class Monitor implements Component {
    private String manufacturer;
    private double size;

    public Monitor(String manufacturer, double size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    @Override
    public void printInfo() {
        System.out.println("Монитор: производитель: " + this.manufacturer + ", диагональ экрана: " + this.size);
    }
}
