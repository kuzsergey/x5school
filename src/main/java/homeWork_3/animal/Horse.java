package homeWork_3.animal;

public class Horse extends Animal {
    private String mane;

    public Horse() {
        super("Сено", "Канюшня");
    }

    public Horse(String mane) {
        this();
        this.mane = mane;
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, String mane) {
        super(food, location);
        this.mane = mane;
    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет.");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь жует траву.");
    }
}
