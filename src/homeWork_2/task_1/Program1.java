package homeWork_2.task_1;

public class Program1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Введите одно целое число.");
            return;
        }
        int i = Integer.parseInt(args[0]);
        System.out.println(i % 10);
    }
}
