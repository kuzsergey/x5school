package homeWork_4.task_1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(5.0, 9.0, 8.0);
        shapes[1] = new Circle(5.0);
        shapes[2] = new Rectangle(5.0, 3.0);
        for (Shape shape : shapes) {
            // System.out.println("Площадь фигуры " + shape.square());
            System.out.printf("Площадь фигуры %.2f\n", shape.square());
        }
    }
}
