public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accNum, String holder, double bal) {
        this.accountNumber = accNum;
        this.accountHolder = holder;
        this.balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
}