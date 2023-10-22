public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
            balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
            return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
