package SmartCityTransportAndServiceManagementSystem;

public interface TransportService {
    String getServiceName();
    double getFareRate();

    // Java 8 Default Method
    default void printServiceDetails() {
        System.out.println("Service: " + getServiceName() + " | Rate: $" + getFareRate() + "/km");
    }
}