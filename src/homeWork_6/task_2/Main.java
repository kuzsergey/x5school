package homeWork_6.task_2;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.Add(new Apple(), 15);
        Box<Orange> orangeBox = new Box<>();
        orangeBox.Add(new Orange(), 10);
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox1.Compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        appleBox1.send(appleBox2);
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());

    }
}
