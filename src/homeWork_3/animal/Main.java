package homeWork_3.animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        Horse horse = new Horse();
        horse.makeNoise();
        horse.eat();
        horse.sleep();

        Veterinarian veterinarian = new Veterinarian();

        Animal[] animals = new Animal[]{
                new Cat(), new Dog(), new Horse()
        };
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

    }
}
