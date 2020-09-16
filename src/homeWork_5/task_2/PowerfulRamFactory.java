package homeWork_5.task_2;

public class PowerfulRamFactory extends RamFactory {
    @Override
    public Component create() {
        return new Ram("Kingston", 32, 3000, "DDR4");
    }
}
