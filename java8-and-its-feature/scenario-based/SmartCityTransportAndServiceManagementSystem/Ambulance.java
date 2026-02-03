package SmartCityTransportAndServiceManagementSystem;

public class Ambulance implements TransportService, EmergencyService {
    @Override
    public String getServiceName() {
        return "City Ambulance";
    }

    @Override
    public double getFareRate() {
        return 0.0; // Emergency services often have no fare
    }

    @Override
    public void printServiceDetails() {
        System.out.println("[EMERGENCY] Service: " + getServiceName() + " | Priority: High");
    }
}