package StreamAPIPractice;

import java.util.Arrays;
import java.util.List;

public class IoTSensorStream {
    public static void main(String[] args) {
        // Simulated temperature readings from an IoT sensor in Celsius
        List<Double> sensorReadings = Arrays.asList(32.5, 34.2, 38.9, 31.0, 39.5, 40.2, 33.8);
        
        double threshold = 35.0;

        System.out.println("--- High Temperature Alerts ---");

        // Task: Use streams to filter and forEach() to print
        sensorReadings.stream()
            .filter(temp -> temp > threshold) // Filter: keep only values > 35
            .forEach(temp -> System.out.println("ALERT: High Temperature Detected: " + temp + "°C"));
    }
}