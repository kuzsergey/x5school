package homeWork_2.task_5;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите целое число:");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число: " + min);

    }
}
