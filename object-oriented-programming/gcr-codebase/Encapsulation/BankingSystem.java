interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds or invalid amount.");
    }

    // Encapsulation
    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }
    public String getHolderName() { return holderName; }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.04; // 4% Interest
        deposit(interest);
        System.out.println("Savings Interest Added: $" + interest);
    }

    @Override
    public boolean applyForLoan(double amount) {
        return amount <= calculateLoanEligibility();
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Eligible for 5x balance
    }
}