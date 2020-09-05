package homeWork_2.task_5;

public class Program5 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Введите три  целых числа.");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int min = 0;
        if (a < b) {
            min = a;
        } else min = b;
        if (c < min) {
            min = c;
        }
        System.out.println(min);

    }
}
