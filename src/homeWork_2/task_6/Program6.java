package homeWork_2.task_6;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int i = scanner.nextInt();
        if (i == 0) {
            System.out.println("Нулевое число");
        } else if (i > 0) {
            if ((i % 2) == 0) {
                System.out.println("Положительное четное число");
            } else {
                System.out.println("Положительное нечетное число");
            }
        } else {
            if ((i % 2) == 0) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
            }
        }
    }
}
