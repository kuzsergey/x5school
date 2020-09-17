package homeWork_5.task_2;

public class ComputerFactory {
    private CpuFactory cpuFactory = null;
    private RamFactory ramFactory = null;
    private GraphicsCardFactory graphicsCardFactory = null;
    private StorageDeviceFactory storageDeviceFactory = null;
    private MonitorFactory monitorFactory = null;

    public Computer createComputer(TypeComputer typeComputer) {
        Computer computer = new Computer();
        switch (typeComputer) {
            case Gaming:
                GamingCreateComputer();
                break;
            case Office:
                OfficeCreateComputer();
                break;
            default:
        }
        computer.setCpu((Cpu) cpuFactory.create());
        computer.setRam((Ram) ramFactory.create());
        computer.setGraphicsCard((GraphicsCard) graphicsCardFactory.create());
        computer.setStorageDevice((StorageDevice) storageDeviceFactory.create());
        computer.setMonitor((Monitor) monitorFactory.create());

        return computer;
    }

    private void GamingCreateComputer() {
        this.cpuFactory = new GamingCpuFactory();
        this.ramFactory = new GamingRamFactory();
        this.graphicsCardFactory = new GamingGraphicCardFactory();
        this.storageDeviceFactory = new GamingStorageDeviceFactory();
        this.monitorFactory = new GamingMonitorFactory();
    }

    private void OfficeCreateComputer() {
        this.cpuFactory = new OfficeCpuFactory();
        this.ramFactory = new OfficeRamFactory();
        this.graphicsCardFactory = new OfficeGraphicCardFactory();
        this.storageDeviceFactory = new OfficeStorageDeviceFactory();
        this.monitorFactory = new OfficeMonitorFactory();
    }
}
