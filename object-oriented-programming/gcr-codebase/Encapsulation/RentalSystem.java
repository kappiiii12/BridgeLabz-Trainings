// Interface for Insurance
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Superclass
abstract class Vehicle {
    private String vehicleNumber;
    private double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    // Getters for Encapsulation
    public double getRentalRate() { return rentalRate; }
    public String getVehicleNumber() { return vehicleNumber; }
}

// Concrete Class: Truck (Insurable)
class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Extra flat fee for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 2.5; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy: " + policyNumber;
    }
}

// Concrete Class: Bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Truck("T-99", 100.0, "INS-777"),
            new Bike("B-12", 20.0)
        };

        for (Vehicle v : fleet) {
            System.out.println("Vehicle: " + v.getVehicleNumber());
            System.out.println("Rental Cost (3 days): $" + v.calculateRentalCost(3));
            
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance: $" + i.calculateInsurance());
            }
            System.out.println("-------------------------");
        }
    }
}