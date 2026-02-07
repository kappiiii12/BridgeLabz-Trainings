package BankingSystemWithMultipleTransaction;

public class BankAccount {
    private  Double balance ;

	public BankAccount(Double balance) {
		super();
		this.balance = balance;
	}
    public synchronized void withdraw(String name,Double amount ) {
    	try{
    		if(amount > this.balance)
    			System.out.println("Infsufficient balance");
    		else {
    	              System.out.println(name+" : Attempting to withdraw "+amount);
    	              Thread.sleep(200);
    	              balance -= amount;
    	              System.out.println("Transaction Successful Available Balance :"+balance);
    		      }
    	
          }catch(InterruptedException e) { 
    	         System.out.println("Interrupted Exception"+e);}
    
    	 }
}
