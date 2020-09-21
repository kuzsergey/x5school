package homeWork_7;

import java.io.*;
import java.util.HashMap;

public class FileAccounts {
    public static void createFile(File file) {
        try {
            boolean created = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] holders = {"Sergey", "Alexey", "Ivan", "Peter", "Andrey", "Ania",
                "Denis", "Yuri", "Victor", "Natasha"};
        HashMap<Integer, Account> accounts = new HashMap<>();
        for (int i = 0, id = 0; i < 10; i++) {
            id++;
            int amount = (int) (Math.random() * 10000);
            accounts.put(id, new Account(id, holders[i], amount));
        }
        write(accounts, file);
    }

    public static void write(HashMap<Integer, Account> accounts, File file) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, false))) {
            for (int i = 1; i <= accounts.size(); i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(accounts.get(i).getId());
                stringBuilder.append("|");
                stringBuilder.append(accounts.get(i).getHolder());
                stringBuilder.append("|");
                stringBuilder.append(accounts.get(i).getAmount());
                String text = stringBuilder.toString();
                writer.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<Integer, Account> read(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            HashMap<Integer, Account> accounts = new HashMap<>();
            String text;
            while ((text = reader.readLine()) != null) {
                String[] array = text.split("\\|");
                int id = Integer.parseInt(array[0]);
                String holder = array[1];
                int amount = Integer.parseInt(array[2]);
                Account account = new Account(id, holder, amount);
                accounts.put(account.getId(), account);
            }
            return accounts;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
