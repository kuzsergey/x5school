package homeWork_5.task_2;

public class GraphicsCard implements Component {
    private String manufacturer;  // производитель
    private String memoryType;    // тип памяти
    private int amountMemory;     // объем памяти
    private Cooling cooling;      // охлаждение

    public GraphicsCard(String manufacturer, String memoryType, int amountMemory, Cooling cooling) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.amountMemory = amountMemory;
        this.cooling = cooling;
    }

    @Override
    public void printInfo() {
        System.out.println("Видеокарта: производитель: " + this.manufacturer + ", тип памяти: " + this.memoryType + ", объем памяти: " +
                this.amountMemory + " Гб, охлаждение: " + this.cooling);
    }
}
