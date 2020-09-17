package homeWork_3.animal;

public class Dog extends Animal {
    private String tail;

    public Dog() {
        super("Кость", "Будка");
    }

    public Dog(String tail) {
        this();
        this.tail = tail;
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, String tail) {
        super(food, location);
        this.tail = tail;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    public void eat() {
        System.out.println("Собака грызет кость.");
    }
}
