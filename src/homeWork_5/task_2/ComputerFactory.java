package homeWork_5.task_2;

public class ComputerFactory {
    public static Computer createComputer(TypeComputer typeComputer) {
        Context context = new Context();
        switch (typeComputer) {
            case Gaming:
                context.setStrategy(new GamingCreateComputer());
                break;
            case Office:
                context.setStrategy(new OfficeCreateComputer());
                break;
            default:
        }
        return context.createComputer();

    }

    public static Computer createComputer(AbstractFactory factory) {
        Computer computer = new Computer();
        computer.setCpu(factory.createCpu());
        computer.setGraphicsCard(factory.creteGGraphicsCard());
        computer.setRam(factory.createRam());
        computer.setMonitor(factory.createMonitor());
        computer.setStorageDevice(factory.createStorageDevice());
        return computer;
    }
}
