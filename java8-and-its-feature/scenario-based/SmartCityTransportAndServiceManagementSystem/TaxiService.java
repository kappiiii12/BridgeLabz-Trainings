package SmartCityTransportAndServiceManagementSystem;

public class TaxiService implements TransportService {
    @Override public String getServiceName() { return "Uber/Lyft"; }
    @Override public double getFareRate() { return 3.50; }
}
