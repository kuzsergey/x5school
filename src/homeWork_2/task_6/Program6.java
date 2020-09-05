package homeWork_2.task_6;

public class Program6 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Введите одно целое число.");
            return;
        }
        int i = Integer.parseInt(args[0]);
        if (i == 0) {
            System.out.println("Нулевое число");
        }
        if (i > 0 && (i % 2) == 0) {
            System.out.println("Положительное четное число");
        }
        if (i > 0 && (i % 2) != 0) {
            System.out.println("Положительное нечетное число");
        }
        if (i < 0 && (i % 2) == 0) {
            System.out.println("Отрицательное четное число");
        }
        if (i < 0 && (i % 2) != 0) {
            System.out.println("Отрицательное нечетное число");
        }
    }
}
