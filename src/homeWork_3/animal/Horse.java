package homeWork_3.animal;

public class Horse extends Animal {
    public Horse() {
        super();
        this.food = "Сено";
        this.location = "Канюшня";
    }

    @Override
    void makeNoise() {
        System.out.println("Лошадь ржет.");
    }

    @Override
    void eat() {
        System.out.println("Лошадь жует траву.");
    }
}
