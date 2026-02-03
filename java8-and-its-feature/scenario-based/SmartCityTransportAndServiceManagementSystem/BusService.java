package SmartCityTransportAndServiceManagementSystem;

public class BusService implements TransportService {
    @Override public String getServiceName() { return "City Bus"; }
    @Override public double getFareRate() { return 1.50; }
}