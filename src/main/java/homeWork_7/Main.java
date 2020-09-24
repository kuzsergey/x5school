package homeWork_7;

import java.io.File;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File file = new File("account.txt");
        if (!file.exists()) {
            FileAccounts.createFile(file);
        }
        HashMap<Integer, Account> accounts = FileAccounts.read(file);
        User user = new User();
        user.managingAccounts(accounts, file);

    }
}
