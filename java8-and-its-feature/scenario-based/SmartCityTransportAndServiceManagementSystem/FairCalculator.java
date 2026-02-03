package SmartCityTransportAndServiceManagementSystem;


@FunctionalInterface
public interface FairCalculator {
    // Single Abstract Method for Lambda usage
    double calculateFare(double distance, double rate);
}