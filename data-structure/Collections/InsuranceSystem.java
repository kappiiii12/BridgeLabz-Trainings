import java.util.*;
import java.time.LocalDate;


abstract class InsurancePolicy implements Comparable<InsurancePolicy> {
    
    private String policyNumber;
    private String holderName;
    private LocalDate expiryDate;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String holderName, LocalDate expiryDate, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getHolderName() { return holderName; }


    public abstract String getCoverageType();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsurancePolicy)) return false;
        InsurancePolicy that = (InsurancePolicy) o;
        return Objects.equals(policyNumber, that.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }


    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return String.format("[%s] %-10s | %-10s | Exp: %s", 
                getCoverageType(), policyNumber, holderName, expiryDate);
    }
}


class HealthPolicy extends InsurancePolicy {
    public HealthPolicy(String num, String name, LocalDate date, double amt) {
        super(num, name, date, amt);
    }

    @Override
    public String getCoverageType() { return "HEALTH"; }
}

class AutoPolicy extends InsurancePolicy {
    public AutoPolicy(String num, String name, LocalDate date, double amt) {
        super(num, name, date, amt);
    }

    @Override
    public String getCoverageType() { return "AUTO"; }
}


class PolicyManager {
    private Set<InsurancePolicy> fastLookup = new HashSet<>();
    private Set<InsurancePolicy> insertionOrder = new LinkedHashSet<>();
    private TreeSet<InsurancePolicy> sortedExpiry = new TreeSet<>();

    public void addPolicy(InsurancePolicy p) {
        fastLookup.add(p);
        insertionOrder.add(p);
        sortedExpiry.add(p);
    }

    public void displaySorted() {
        System.out.println("\n--- Policies Sorted by Expiry Date (TreeSet) ---");
        sortedExpiry.forEach(System.out::println);
    }

    public void showExpiringSoon() {
        System.out.println("\n--- Expiring within 30 days ---");
        LocalDate limit = LocalDate.now().plusDays(30);
        sortedExpiry.stream()
            .filter(p -> p.getExpiryDate().isBefore(limit))
            .forEach(System.out::println);
    }
}


public class InsuranceSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        
        manager.addPolicy(new HealthPolicy("H101", "Alice", LocalDate.of(2026, 1, 15), 500));
        manager.addPolicy(new AutoPolicy("A202", "Bob", LocalDate.of(2026, 5, 20), 300));
        manager.addPolicy(new HealthPolicy("H303", "Charlie", LocalDate.of(2026, 1, 10), 450));

        manager.displaySorted();
        manager.showExpiringSoon();
    }
} 
