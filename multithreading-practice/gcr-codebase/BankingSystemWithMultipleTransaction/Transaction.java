package BankingSystemWithMultipleTransaction;

public class Transaction implements Runnable {
    private String customerName;
    private Double amount ;
    private BankAccount b ;
	public Transaction(String customerName, Double amount , BankAccount b) {
		super();
		this.customerName = customerName;
		this.amount = amount;
		this.b= b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
        b.withdraw(customerName, amount);
	}

}
