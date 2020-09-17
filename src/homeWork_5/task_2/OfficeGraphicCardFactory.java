package homeWork_5.task_2;

public class OfficeGraphicCardFactory extends GraphicsCardFactory {
    @Override
    public Component create() {
        return new GraphicsCard("GeForce ", "DDR3", 1, Cooling.Passive);
    }
}
