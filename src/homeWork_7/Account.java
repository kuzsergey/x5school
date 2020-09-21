package homeWork_7;

public class Account {
    private int id;
    private String holder;
    private int amount;

    public Account(int id, String holder, int amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getHolder() {
        return holder;
    }

    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Id: %d holder: %s amount: %d", this.id, this.holder, this.amount);
    }
}
