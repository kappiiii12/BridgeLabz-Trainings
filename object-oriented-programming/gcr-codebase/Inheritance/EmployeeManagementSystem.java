// Employee Management System
// Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
// Tasks:
// Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
// Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
// Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: $" + salary);
    }
}

// 2. Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Pass data to Employee constructor
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent method
        System.out.println("Role: Manager | Team Size: " + teamSize);
    }
}

// 3. Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer | Language: " + programmingLanguage);
    }
}

// 4. Subclass: Intern
class Intern extends Employee {
    private String university;

    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern | University: " + university);
    }
}