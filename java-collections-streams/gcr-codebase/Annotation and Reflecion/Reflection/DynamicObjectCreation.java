import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // 1. Get the Class object
            Class<?> studentClass = Class.forName("Student");

            // 2. Get the specific constructor (the one taking a String)
            // Constructor types must match exactly
            Constructor<?> constructor = studentClass.getConstructor(String.class);

            // 3. Create the instance (Equivalent to: new Student("Alice"))
            Object studentInstance = constructor.newInstance("Alice");

            // 4. Verify by calling a method on the new object
            Student myStudent = (Student) studentInstance;
            myStudent.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Student {
    private String name;

    // Constructor to be called via Reflection
    public Student(String name) {
        this.name = name;
        System.out.println("Constructor called! Student created: " + this.name);
    }

    public void display() {
        System.out.println("Hello, my name is " + name);
    }
}