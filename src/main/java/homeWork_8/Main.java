package homeWork_8;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws homeWork_8.UnknownAccountException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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
}
