package homeWork_5.task_2;


public class GamingRamFactory implements RamFactory {
    @Override
    public Component create() {
        return new Ram("Kingston", 32, 3000, "DDR4");
    }
}
