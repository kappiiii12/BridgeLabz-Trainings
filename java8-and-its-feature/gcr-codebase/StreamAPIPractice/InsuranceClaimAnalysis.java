package StreamAPIPractice;
import java.util.*;
import java.util.stream.Collectors;
    class InsuranceClaim {
    private String insuranceId;
    private String claimType;
    private double claimAmount;

    // Parameterized Constructor
    public InsuranceClaim(String insuranceId, String claimType, double claimAmount) {
        this.insuranceId = insuranceId;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }

    // Getters
    public String getInsuranceId() {
        return insuranceId;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}
public class InsuranceClaimAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<InsuranceClaim> claims = new ArrayList<>();

        // Adding 10 dummy insurance claim objects
        claims.add(new InsuranceClaim("CL-001", "Auto", 2500.50));
        claims.add(new InsuranceClaim("CL-002", "Home", 12000.00));
        claims.add(new InsuranceClaim("CL-003", "Health", 450.75));
        claims.add(new InsuranceClaim("CL-004", "Life", 50000.00));
        claims.add(new InsuranceClaim("CL-005", "Auto", 890.00));
        claims.add(new InsuranceClaim("CL-006", "Health", 120.00));
        claims.add(new InsuranceClaim("CL-007", "Travel", 310.25));
        claims.add(new InsuranceClaim("CL-008", "Home", 5600.00));
        claims.add(new InsuranceClaim("CL-009", "Auto", 1500.00));
        claims.add(new InsuranceClaim("CL-010", "Health", 2100.40));
        
        Map<String,Double> res = claims.stream()
        		                          .collect(Collectors.groupingBy(InsuranceClaim::getClaimType,Collectors.averagingDouble(InsuranceClaim::getClaimAmount)));
        res.forEach((type,avg) -> System.out.println("Type : "+ type +"--------- Average : "+avg));
	}
         
}
