package homeWork_8;

import java.sql.Connection;

public class AccountService {
    private Connection connection;

    public AccountService(Connection connection) {
        this.connection = connection;
    }

    public void balance(int accountId) throws UnknownAccountException {
        Account account = DBAccounts.read(connection, accountId);
        if (account.getId() == 0) {
            throw new UnknownAccountException("Неизвестный счет");
        }
        System.out.println(account.getAmount());
    }

    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account account = DBAccounts.read(connection, accountId);
        if (account.getId() == 0) {
            throw new UnknownAccountException("Неизвестный счет");
        }
        if (account.getAmount() < amount) {
            throw new NotEnoughMoneyException("На счету не достаточно средств.");
        }
        int currentAmount = account.getAmount();
        account.setAmount(currentAmount - amount);
        DBAccounts.write(connection, account);

    }

    public void deposit(int accountId, int amount) throws UnknownAccountException {
        Account account = DBAccounts.read(connection, accountId);
        if (account.getId() == 0) {
            throw new UnknownAccountException("Неизвестный счет");
        }
        int currentAmount = account.getAmount();
        account.setAmount(currentAmount + amount);
        DBAccounts.write(connection, account);
    }

    public void transfer(int from, int to, int amount) throws UnknownAccountException, NotEnoughMoneyException {
        Account fromAccount = DBAccounts.read(connection, from);
        Account toAccount = DBAccounts.read(connection, to);
        if (fromAccount.getId() == 0) {
            throw new UnknownAccountException("Неизвестный счет отправителя.");
        }
        if (toAccount.getId() == 0) {
            throw new UnknownAccountException("Неизвестный счет получателя.");
        }
        if (fromAccount.getAmount() < amount) {
            throw new NotEnoughMoneyException("На счету отправителя не достаточно средств.");
        }
        withdraw(from, amount);
        deposit(to, amount);
    }
}
