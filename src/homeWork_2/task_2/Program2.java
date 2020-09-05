package homeWork_2.task_2;

public class Program2 {
    public static void main(String[] args) {
        if ((args.length != 1)) {
            System.out.println("Введите одно целое трехзначное число.");
            return;
        }
        if (args[0].length() != 3) {
            System.out.println("Введите одно целое трехзначное число.");
            return;
        }
        int i = Integer.parseInt(args[0]);
        int a = i % 10;
        int b = i / 10 % 10;
        int c = i / 100;
        int sum = a + b + c;
        System.out.println(sum);
    }
}
