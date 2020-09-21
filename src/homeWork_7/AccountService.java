package homeWork_7;

import java.io.File;
import java.util.HashMap;

public class AccountService {
    private HashMap<Integer, Account> accounts;

    public AccountService(HashMap<Integer, Account> accounts) {
        this.accounts = accounts;
    }

    public void balance(int accountId) throws UnknownAccountException {
        if (accounts.get(accountId) == null) {
            throw new UnknownAccountException("Неизвестный счет");
        }
        System.out.println(accounts.get(accountId).getAmount());
    }

    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        if (accounts.get(accountId) == null) {
            throw new UnknownAccountException("Неизвестный счет");
        }
        if (accounts.get(accountId).getAmount() < amount) {
            throw new NotEnoughMoneyException("На счету не достаточно средств.");
        }
        int currentAmount = accounts.get(accountId).getAmount();
        accounts.get(accountId).setAmount(currentAmount - amount);
    }

    public void deposit(int accountId, int amount) throws UnknownAccountException {
        if (accounts.get(accountId) == null) {
            throw new UnknownAccountException("Неизвестный счет");
        }
        int currentAmount = accounts.get(accountId).getAmount();
        accounts.get(accountId).setAmount(currentAmount + amount);
    }

    public void transfer(int from, int to, int amount) throws UnknownAccountException, NotEnoughMoneyException {
        if (accounts.get(from) == null) {
            throw new UnknownAccountException("Неизвестный счет отправителя.");
        }
        if (accounts.get(to) == null) {
            throw new UnknownAccountException("Неизвестный счет получателя.");
        }
        if (accounts.get(from).getAmount() < amount) {
            throw new NotEnoughMoneyException("На счету отправителя не достаточно средств.");
        }
        withdraw(from, amount);
        deposit(to, amount);
    }
}
