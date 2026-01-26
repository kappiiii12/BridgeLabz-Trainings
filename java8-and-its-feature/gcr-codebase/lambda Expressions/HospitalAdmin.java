//package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class HospitalAdmin {
    public static void main(String[] args) {
        // List of Patient IDs (Alphanumeric for medical records)
        List<String> patientIds = Arrays.asList("PAT-7742", "PAT-9103", "PAT-1120", "PAT-5567");

        System.out.println("--- Patient ID Verification List ---");

        // The Task: Using method reference instead of (id -> System.out.println(id))
        patientIds.forEach(System.out::println);
    }
}
