package homeWork_6.task_2;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        for (int i = 0; i < 15; i++) {
            appleBox1.add(new Apple());
        }
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 10; i++) {
            orangeBox.add(new Orange());
        }
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox1.compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        appleBox1.send(appleBox2);
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());
    }
}
