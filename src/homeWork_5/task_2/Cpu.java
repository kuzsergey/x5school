package homeWork_5.task_2;

public class Cpu implements Component {
    private double clockFrequency;             //тактовая частота
    private int processorCores;                //кол-во ядер
    private double cacheMemory;                //кеш память
    private String name;                       //название
    private String manufacturer;               //производитель


    public Cpu(double clockFrequency, int processorCores, double cacheMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.processorCores = processorCores;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public void printInfo() {
        System.out.println("Процессор: производитель :" + this.manufacturer + ", название: " + this.name + ", тактоая частота: " + this.clockFrequency +
                " ГГц, кол-во ядер: " + processorCores + ", кеш память: " + this.cacheMemory + " Мб");
    }
}
