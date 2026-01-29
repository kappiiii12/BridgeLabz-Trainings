package StreamAPIPractice;

import java.util.*;

class Doctor {
    private String doctorName;
    private boolean availableOnWeekends;
    private String speciality;

    // Constructor to set values
    public Doctor(String doctorName, boolean availableOnWeekends, String speciality) {
        this.doctorName = doctorName;
        this.availableOnWeekends = availableOnWeekends;
        this.speciality = speciality;
    }

    // Getters
    public String getDoctorName() {
        return doctorName;
    }

    public boolean isAvailableOnWeekends() {
        return availableOnWeekends;
    }

    public String getSpeciality() {
        return speciality;
    }
    public void displayDoctor() {
        System.out.println("Doctor Name: " + this.doctorName);
        System.out.println("Speciality : " + this.speciality);
        System.out.println("Available on Weekends: " + (this.availableOnWeekends ? "Yes" : "No"));
    }
}
public class DoctorAvailability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1 = new Doctor("Dr. Kapil", true, "cardiologist");
		Doctor d2 = new Doctor("Dr. Shalini", false, "dermatologist");
		Doctor d3 = new Doctor("Dr. Amit", true, "neurologist");
		Doctor d4 = new Doctor("Dr. Priya", true, "pediatrician");
		Doctor d5 = new Doctor("Dr. Vikram", false, "orthopedic");
		Doctor d6 = new Doctor("Dr. Sneha", true, "cardiologist");
		Doctor d7 = new Doctor("Dr. Rajat", false, "oncologist");
		Doctor d8 = new Doctor("Dr. Megha", true, "gynaecologist");
		Doctor d9 = new Doctor("Dr. Rohan", false, "psychiatrist");
		Doctor d10 = new Doctor("Dr. Ananya", true, "ophthalmologist");
      List<Doctor> arr = new ArrayList<>(Arrays.asList(
    		    d1, d2, d3, d4, d5, d6, d7, d8, d9, d10
    		));
      List<Doctor> res = arr.stream()
    		                .filter( (x) -> x.isAvailableOnWeekends())
    		                .sorted((x1,x2) -> x1.getSpeciality().compareTo(x2.getSpeciality()))
    		                .toList();
      System.out.println("__________List Of Doctors Available On Weekends________");
      for(Doctor x : res) {
    	  x.displayDoctor();
    	  System.out.println("------_______-------________-------________--------");
      }
	}

}
