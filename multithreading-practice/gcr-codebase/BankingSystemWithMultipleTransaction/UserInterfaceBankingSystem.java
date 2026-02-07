package BankingSystemWithMultipleTransaction;

public class UserInterfaceBankingSystem {
  public static void main( String[] args) {
	  BankAccount b = new BankAccount(10000.00);
	  
	  Transaction t1 = new Transaction("Costumer 1",3000.00,b);
	  Transaction t2 = new Transaction("Costumer 2",4000.00,b);
	  Transaction t3 = new Transaction("Costumer 3",5000.00,b);
	  
	  Thread m1 = new Thread(t1);
	  Thread m2 = new Thread(t2);
	  Thread m3 = new Thread(t3);
	  
	  m1.start();
	  m2.start();
	  m3.start();
  }
}
