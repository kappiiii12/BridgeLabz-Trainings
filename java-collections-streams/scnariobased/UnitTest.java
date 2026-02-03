package TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

// --- The Program Logic ---
class Program {
    private double balance;

    public Program(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Deposit amount cannot be negative");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Insufficient funds.");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}

// --- The Test Suite ---
public class UnitTest {

    @Test
    public void Test_Deposit_ValidAmount() throws Exception {
        Program account = new Program(1000.0);
        double depositAmount = 500.0;
        double expectedBalance = 1500.0;

        account.deposit(depositAmount);

        assertEquals(expectedBalance, account.getBalance(), 0.001);
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Program account = new Program(1000.0);
        double negativeDeposit = -100.0;

        Exception exception = assertThrows(Exception.class, () -> {
            account.deposit(negativeDeposit);
        });
        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    public void Test_Withdraw_ValidAmount() throws Exception {
        Program account = new Program(1000.0);
        double withdrawAmount = 400.0;
        double expectedBalance = 600.0;

        account.withdraw(withdrawAmount);

        assertEquals(expectedBalance, account.getBalance(), 0.001);
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(500.0);
        double overdrawAmount = 600.0;

        Exception exception = assertThrows(Exception.class, () -> {
            account.withdraw(overdrawAmount);
        });
        assertEquals("Insufficient funds.", exception.getMessage());
    }
}