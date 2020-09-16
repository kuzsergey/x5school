package homeWork_5.task_2;

public class StorageDevice implements Component {
    private String manufacturer; // производитель
    private int amountMemory;    // объем памяти
    private TypeDrive typeDrive; // тип накопителя
    private String formsFactor;  // форм-фактор

    public StorageDevice(String manufacturer, int amountMemory, TypeDrive typeDrive, String formsFactor) {
        this.manufacturer = manufacturer;
        this.amountMemory = amountMemory;
        this.typeDrive = typeDrive;
        this.formsFactor = formsFactor;
    }

    @Override
    public void printInfo() {
        System.out.println("Накопитель: производитель: " + this.manufacturer + ", объем памяти: " + this.amountMemory + " Гб, тип накопителя: " +
                this.typeDrive + ", форм-фактор: " + this.formsFactor);
    }
}
