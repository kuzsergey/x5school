package homeWork_3.animal;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();

        Animal[] animals = new Animal[]{
                new Cat(), new Dog(), new Horse()
        };
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
        }
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

    }
}
