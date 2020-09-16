package homeWork_5.task_2;

public class PowerfulGraphicCardFactory extends GraphicsCardFactory {
    @Override
    public Component create() {
        return new GraphicsCard("GIGABYTE", "GDDR6", 11, Cooling.Active);
    }
}
