import java.util.ArrayList;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.deptName = name;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(String name) { employees.add(new Employee(name)); }
}

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Composition: Departments are created inside the Company and die with it
    public void createDepartment(String deptName) {
        departments.add(new Department(deptName));
    }
}