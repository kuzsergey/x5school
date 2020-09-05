package homeWork_3.animal;

public class Dog extends Animal {
    public Dog() {
        super();
        this.food = "Кость";
        this.location = "Будка";
    }

    @Override
    void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    void eat() {
        System.out.println("Собака грызет кость.");
    }
}
