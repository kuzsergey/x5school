package homeWork_8;



import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Scanner;

public class User {
    public void managingAccounts(Connection connection) {
        AccountService accountService = new AccountService(connection);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] strings = scanner.nextLine().split(" ");
            int[] array = new int[strings.length];
            for (int i = 1; i < strings.length; i++) {
                array[i] = Integer.parseInt(strings[i].replace("[", "").
                        replace("]", ""));
            }
            switch (strings[0]) {
                case "exit":
                    return;
                case "balance":
                    try {
                        accountService.balance(array[1]);
                    } catch (UnknownAccountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "withdraw":
                    try {
                        accountService.withdraw(array[1], array[2]);
                    } catch (NotEnoughMoneyException e) {
                        System.out.println(e.getMessage());
                    } catch (UnknownAccountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "deposite":
                    try {
                        accountService.deposit(array[1], array[2]);
                    } catch (UnknownAccountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "transfer":
                    try {
                        accountService.transfer(array[1], array[2], array[3]);
                    } catch (UnknownAccountException e) {
                        System.out.println(e.getMessage());
                    } catch (NotEnoughMoneyException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Неверный формат команды");
            }
        }
    }
}
