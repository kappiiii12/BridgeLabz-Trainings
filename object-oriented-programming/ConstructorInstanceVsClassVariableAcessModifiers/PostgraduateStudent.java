public class PostgraduateStudent extends Student {
    
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void showInheritedDetails() {
        // Accessing public and protected members directly
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); 
        
        // System.out.println(cgpa); // This would cause a COMPILE ERROR (private)
        System.out.println("CGPA: " + getCgpa()); // Accessing via public method
    }
}