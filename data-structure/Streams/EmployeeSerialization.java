import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name, dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id; this.name = name; this.dept = dept; this.salary = salary;
    }
    @Override
    public String toString() { return id + " | " + name + " | " + dept + " | " + salary; }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1, "Alice", "IT", 70000), new Employee(2, "Bob", "HR", 50000));

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(list);
        } catch (IOException e) { e.printStackTrace(); }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            List<Employee> retrieved = (List<Employee>) ois.readObject();
            retrieved.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    }
}