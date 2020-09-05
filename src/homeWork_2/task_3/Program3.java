package homeWork_2.task_3;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое  число:");
        int i = scanner.nextInt();
        if (i > 0) {
            i++;
        }
        System.out.println(i);
    }
}
