package homeWork_8;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws homeWork_8.UnknownAccountException {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './schema.sql'")) {
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
