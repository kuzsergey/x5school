package homeWork_5.task_2;

public class GamingFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new Cpu(4.5, 10, 19.25, "Core i9 10900X", "Intel");
    }

    @Override
    public GraphicsCard creteGGraphicsCard() {
        return new GraphicsCard("GIGABYTE", "GDDR6", 11, Cooling.Active);
    }

    @Override
    public Monitor createMonitor() {
        return new Monitor("SAMSUNG", 27);
    }

    @Override
    public Ram createRam() {
        return new Ram("Kingston", 32, 3000, "DDR4");
    }

    @Override
    public StorageDevice createStorageDevice() {
        return new StorageDevice("Samsung", 2, TypeDrive.SSD, "2.5\"");
    }
}
