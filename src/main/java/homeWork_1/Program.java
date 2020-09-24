package homeWork_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        HelloName helloName = new HelloName(name);
        helloName.writeHelloName();
    }
}
