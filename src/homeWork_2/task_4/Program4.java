package homeWork_2.task_4;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое  число:");
        int i = scanner.nextInt();
        if (i > 0) {
            i++;
        } else if (i < 0) {
            i -= 2;
        } else i = 10;
        System.out.println(i);
    }
}
