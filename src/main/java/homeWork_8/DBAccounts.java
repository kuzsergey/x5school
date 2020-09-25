package homeWork_8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccounts {
    public static void createDB(Connection connection) {
        String[] holders = {"Sergey", "Alexey", "Ivan", "Peter", "Andrey", "Ania",
                "Denis", "Yuri", "Victor", "Natasha"};
        String sql = "INSERT INTO ACCOUNTS (id, holder, amount) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            for (int i = 0; i < holders.length; i++) {
                statement.setInt(1, i + 1);
                statement.setString(2, holders[i]);
                statement.setInt(3, (int) (Math.random() * 10000));
                statement.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static Account read(Connection connection, int accountId) {
        String sql = "SELECT * FROM ACCOUNTS WHERE id =" + accountId + " ;";
        int id = 0;
        String holder = null;
        int amount = 0;
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                id = resultSet.getInt(1);
                holder = resultSet.getString(2);
                amount = resultSet.getInt(3);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return new Account(id, holder, amount);
    }

    public static void write(Connection connection, Account account) {
        String sql = "UPDATE ACCOUNTS SET amount = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, account.getAmount());
            statement.setInt(2, account.getId());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
