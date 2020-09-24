package homeWork_2.task_2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int m = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += m % 10;
            m /= 10;
        }
        System.out.println(sum);


    }
}
