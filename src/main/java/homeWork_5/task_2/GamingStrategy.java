package homeWork_5.task_2;

public class GamingStrategy implements Strategy {

    @Override
    public Computer createComputer() {
        Computer computer = new Computer();
        computer.setCpu((Cpu) new GamingCpuFactory().create());
        computer.setRam((Ram) new GamingRamFactory().create());
        computer.setGraphicsCard((GraphicsCard) new GamingGraphicsCardFactory().create());
        computer.setStorageDevice((StorageDevice) new GamingStorageDeviceFactory().create());
        computer.setMonitor((Monitor) new MonitorFactory().create());
        return  computer;
    }
}
