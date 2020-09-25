package homeWork_8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        File file = new File("./schema.sql");
        if (!file.exists()) {
            createFile(file);
        }
        String url = "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './schema.sql'";

        try (Connection connection = DriverManager.getConnection(url)) {
            DBAccounts.createDB(connection);
            User user = new User();
            user.managingAccounts(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createFile(File file) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, false))) {
            file.createNewFile();
            String string = "DROP TABLE IF EXISTS ACCOUNTS;\n" +
                    "CREATE TABLE IF NOT EXISTS ACCOUNTS (\n" +
                    "id VARCHAR(50) NOT NULL,\n" +
                    "holder VARCHAR(50) NOT NULL,\n" +
                    "amount INT\n" +
                    ");\n";
            writer.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
