package homeWork_5.task_2;

public class OfficeFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new Cpu(3.3, 2, 3, "Core i3 3220", "Intel");
    }

    @Override
    public GraphicsCard creteGGraphicsCard() {
        return new GraphicsCard("GeForce ", "DDR3", 1, Cooling.Passive);
    }

    @Override
    public Monitor createMonitor() {
        return new Monitor("LG", 15);
    }

    @Override
    public Ram createRam() {
        return new Ram("HYUNDAI", 2, 1333, "DDR3 ");
    }

    @Override
    public StorageDevice createStorageDevice() {
        return new StorageDevice("Seagate", 300, TypeDrive.HDD, "2.5\'");
    }
}
