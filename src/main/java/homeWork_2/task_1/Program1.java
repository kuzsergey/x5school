package homeWork_2.task_1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int i = scanner.nextInt();
        System.out.println(i % 10);
    }
}
