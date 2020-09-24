package homeWork_3.animal;

public class Cat extends Animal {
    private String moustache;

    public Cat() {
        super("Мыши", "Дом");
    }

    public Cat(String moustache) {
        this();
        this.moustache = moustache;
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, String moustache) {
        super(food, location);
        this.moustache = moustache;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает.");
    }

    @Override
    public void eat() {
        System.out.println("Кошка пьет молоко.");
    }
}
