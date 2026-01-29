package StreamAPIPractice;
import java.util.Date;
import java.text.SimpleDateFormat;

class GymMember {
    private String memberName;
    private Date membershipExpiringDate;

    // Parameterized Constructor
    public GymMember(String memberName, Date membershipExpiringDate) {
        this.memberName = memberName;
        this.membershipExpiringDate = membershipExpiringDate;
    }

    // Getters
    public String getMemberName() {
        return memberName;
    }

    public Date getMembershipExpiringDate() {
        return membershipExpiringDate;
    }

    // Display Method
    public void displayMemberDetails() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = formatter.format(membershipExpiringDate);
        
        System.out.println("Member Name    : " + memberName);
        System.out.println("Expiry Date    : " + formattedDate);
        System.out.println("---------------------------");
    }
}
public class FilteringExpiringMemberships {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
