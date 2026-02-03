package SmartCityTransportAndServiceManagementSystem;

public class Trip {
    private String routeId;
    private double fare;
    private boolean isPeakHour;

    public Trip(String routeId, double fare, boolean isPeakHour) {
        this.routeId = routeId;
        this.fare = fare;
        this.isPeakHour = isPeakHour;
    }

    public String getRouteId() { return routeId; }
    public double getFare() { return fare; }
    public boolean isPeakHour() { return isPeakHour; }
}