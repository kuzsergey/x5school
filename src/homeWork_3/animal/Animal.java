package homeWork_3.animal;

public class Animal {
    String food;
    String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void makeNoise() {
        System.out.println("Животное шумит.");
    }

    void eat() {
        System.out.println("Животное ест.");
    }

    void sleep() {
        System.out.println("Животное спит.");
    }
}
