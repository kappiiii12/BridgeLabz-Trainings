class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 50.0; // Fixed rate per day
    double totalCost;

    // Constructor to initialize and calculate cost
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays * dailyRate;
    }

    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Total Rental Cost: $" + totalCost);
    }
}