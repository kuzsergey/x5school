package homeWork_2.task_3;

public class Program3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Введите одно целое число.");
            return;
        }
        int i = Integer.parseInt(args[0]);
        if (i > 0) {
            i++;
        }
        System.out.println(i);
    }
}
