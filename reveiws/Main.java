package reveiws;
// Parent Class
class Employee {
    String name;

    // Parent Constructor
    Employee(String name) {
        this.name = name; // 'this' refers to the instance variable name
    }

    void work() {
        System.out.println(name + " is performing general duties.");
    }
}

// Child Class
class Manager extends Employee {
    String department;

    Manager(String name, String department) {
        super(name);           // 'super' calls the Parent constructor
        this.department = department; // 'this' distinguishes local variable
    }

    @Override
    void work() {
        super.work();          // 'super' calls the Parent's version of work()
        System.out.println(name + " is also managing the " + department + " department.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", "Tech");
        mgr.work();
    }
}