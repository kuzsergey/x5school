package homeWork_2.task_4;

public class Program4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Введите одно целое число.");
            return;
        }
        int i = Integer.parseInt(args[0]);
        if (i > 0) {
            i++;
        } else if (i < 0) {
            i -= 2;
        } else i = 10;
        System.out.println(i);
    }
}
