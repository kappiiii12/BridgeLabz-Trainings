package SmartCityTransportAndServiceManagementSystem;

import java.util.*;
import java.util.stream.Collectors;

public class UserInterface {
    public static void main(String[] args) {
        // Mock data: List of trips taken in the city
        List<Trip> trips = Arrays.asList(
            new Trip("Route-A", 15.0, true),
            new Trip("Route-B", 10.0, false),
            new Trip("Route-A", 12.0, true),
            new Trip("Route-C", 25.0, false)
        );

        // 1. Grouping passengers by route
        Map<String, List<Trip>> routeGroups = trips.stream()
            .collect(Collectors.groupingBy(Trip::getRouteId));

        // 2. Partitioning Peak vs Non-Peak trips
        Map<Boolean, List<Trip>> peakTraffic = trips.stream()
            .collect(Collectors.partitioningBy(Trip::isPeakHour));

        // 3. Summarizing Fares (Total and Average)
        DoubleSummaryStatistics fareStats = trips.stream()
            .collect(Collectors.summarizingDouble(Trip::getFare));

        // 4. Emergency Detection using Marker Interface
        TransportService activeService = new Ambulance();
        if (activeService instanceof EmergencyService) {
            System.out.println("SYSTEM ALERT: Bypassing traffic rules for " + activeService.getServiceName());
        }

        // Displaying results
        System.out.println("Total City Revenue: $" + fareStats.getSum());
        System.out.println("Average Fare Collected: $" + fareStats.getAverage());
        System.out.println("Peak Hour Trip Count: " + peakTraffic.get(true).size());
    }
}