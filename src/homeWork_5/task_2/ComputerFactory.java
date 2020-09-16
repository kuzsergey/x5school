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
            case Powerful:
                PowerCreateComputer();
                break;
            case Weak:
                WeakCreateComputer();
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

    private void PowerCreateComputer() {
        this.cpuFactory = new PowerfulCpuFactory();
        this.ramFactory = new PowerfulRamFactory();
        this.graphicsCardFactory = new PowerfulGraphicCardFactory();
        this.storageDeviceFactory = new PowerfulStorageDeviceFactory();
        this.monitorFactory = new PowerfulMonitorFactory();
    }

    private void WeakCreateComputer() {
        this.cpuFactory = new WeakCpuFactory();
        this.ramFactory = new WeakRamFactory();
        this.graphicsCardFactory = new WeakGraphicCardFactory();
        this.storageDeviceFactory = new WeakStorageDeviceFactory();
        this.monitorFactory = new WeakMonitorFactory();
    }
}
