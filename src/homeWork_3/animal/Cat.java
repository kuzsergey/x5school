package homeWork_3.animal;

public class Cat extends Animal {
    public Cat() {
        super();
        this.food = "Мыши";
        this.location = "Дом";
    }

    @Override
    void makeNoise() {
        System.out.println("Кошка мяукает.");
    }

    @Override
    void eat() {
        System.out.println("Кошка пьет молоко.");
    }
}
