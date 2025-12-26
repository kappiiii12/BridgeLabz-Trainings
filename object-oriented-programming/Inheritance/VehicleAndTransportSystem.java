// Base Class: Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.print("Max Speed: " + maxSpeed + " km/h | Fuel: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Type: Car | Seats: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private double payloadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double payloadCapacity) {
        super(maxSpeed, fuelType);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Type: Truck | Payload: " + payloadCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Type: Motorcycle | Has Sidecar: " + hasSidecar);
    }
}