public class Student {
    public int rollNumber;       // Public
    protected String name;       // Protected
    private double cgpa;         // Private

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter for private member
    public double getCgpa() {
        return cgpa;
    }

    // Public setter for private member
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        }
    }
}

