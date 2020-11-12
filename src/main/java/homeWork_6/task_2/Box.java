package homeWork_6.task_2;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {
    private List<E> fruits = new ArrayList<>();
    public void add(E fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (E fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void send(Box<E> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
