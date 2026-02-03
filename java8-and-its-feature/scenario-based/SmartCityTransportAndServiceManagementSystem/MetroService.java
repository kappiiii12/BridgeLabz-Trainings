package SmartCityTransportAndServiceManagementSystem;

public class MetroService implements TransportService {
	@Override public String getServiceName() { return "Uber/Lyft"; }
    @Override public double getFareRate() { return 3.50; }

}
