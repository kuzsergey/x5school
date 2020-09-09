package homeWork_2.task_6;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int i = scanner.nextInt();
        boolean positive;
        boolean evenNumber;
        positive = i > 0;
        evenNumber = (i % 2) == 0;
        if (i == 0) {
            System.out.println("Нулевое число");
        } else if (positive) {
            if (evenNumber) {
                System.out.println("Положительное четное число");
            } else {
                System.out.println("Положительное нечетное число");
            }
        } else {
            if (evenNumber) {
                System.out.println("Отрицательное четное число");
            } else {
                System.out.println("Отрицательное нечетное число");
            }
        }
    }
}
