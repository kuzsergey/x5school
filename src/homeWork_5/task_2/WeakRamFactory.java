package homeWork_5.task_2;

public class WeakRamFactory extends RamFactory {
    @Override
    public Component create() {
        return new Ram("HYUNDAI", 2, 1333, "DDR3 ");
    }
}
