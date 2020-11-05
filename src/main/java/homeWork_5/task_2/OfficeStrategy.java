package homeWork_5.task_2;

public class OfficeStrategy implements Strategy {

    @Override
    public Computer createComputer() {
        Computer computer = new Computer();
        computer.setCpu((Cpu) new OfficeCpuFactory().create());
        computer.setRam((Ram) new OfficeRamFactory().create());
        computer.setGraphicsCard((GraphicsCard) new OfficeGraphicsCardFactory().create());
        computer.setStorageDevice((StorageDevice) new OfficeStorageDeviceFactory().create());
        computer.setMonitor((Monitor) new MonitorFactory().create());
        return  computer;
    }
}
