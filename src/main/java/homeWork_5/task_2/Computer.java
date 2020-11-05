package homeWork_5.task_2;
public class Computer {
    private Cpu cpu;
    private Ram ram;
    private GraphicsCard graphicsCard;
    private StorageDevice storageDevice;
    private Monitor monitor;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public StorageDevice getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void turnOn() {
        System.out.println("Характеристики компьютера: ");
        this.cpu.printInfo();
        this.ram.printInfo();
        this.graphicsCard.printInfo();
        this.storageDevice.printInfo();
        this.monitor.printInfo();

    }
}
