class Customer {
    private String name;
    private Bank bank; // Association

    public Customer(String name) { this.name = name; }
    
    public void setBank(Bank bank) { this.bank = bank; }
    
    public void viewBalance() {
        System.out.println(name + " checking balance at " + bank.getName());
    }
}

class Bank {
    private String name;
    
    public Bank(String name) { this.name = name; }
    public String getName() { return name; }

    public void openAccount(Customer customer) {
        customer.setBank(this);
        System.out.println("Account opened for " + customer);
    }
}