package homeWork_5.task_2;

public interface AbstractFactory {
    Cpu createCpu();

    GraphicsCard creteGGraphicsCard();

    Monitor createMonitor();

    Ram createRam();

    StorageDevice createStorageDevice();
}
