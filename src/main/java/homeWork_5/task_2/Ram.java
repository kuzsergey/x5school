package homeWork_5.task_2;
public class Ram implements Component {
    private String manufacturer;     // производитель
    private int amountMemory;        // объем памяти
    private int frequency;           // частота
    private String memoryType;       // тип памяти

    public Ram(String manufacturer, int amountMemory, int frequency, String memoryType) {
        this.manufacturer = manufacturer;
        this.amountMemory = amountMemory;
        this.frequency = frequency;
        this.memoryType = memoryType;
    }

    @Override
    public void printInfo() {
        System.out.println("Оперативная память: производитель: " + this.manufacturer + ", объем памяти: " + this.amountMemory +
                " Мб, частота: " + this.frequency + " МГц, тип памяти: " + this.memoryType);
    }
}
