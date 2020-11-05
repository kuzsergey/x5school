package homeWork_5.task_2;

public class ComputerFactory {
    Computer create(TypeComputer typeComputer) {
        Context context = new Context();
        switch (typeComputer) {
            case Gaming:
                context.setStrategy((new GamingStrategy()));
                break;
            case Office:
                context.setStrategy((new OfficeStrategy()));
                break;
            default:
        }
        Computer computer = context.createComputerStrategy();
        return computer;
    }


}
