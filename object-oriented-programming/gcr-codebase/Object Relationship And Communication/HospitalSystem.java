class Doctor {
    private String name;
    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is treating " + p.getName());
        p.receiveDiagnosis("Healthy");
    }
}

class Patient {
    private String name;
    public String getName() { return name; }
    public void receiveDiagnosis(String desc) { 
        System.out.println(name + " received diagnosis: " + desc); 
    }
}