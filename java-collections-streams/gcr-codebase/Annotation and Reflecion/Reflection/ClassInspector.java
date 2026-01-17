import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInspector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fully qualified class name (e.g., java.lang.String): ");
        String className = scanner.nextLine();

        try {
            // Load the class dynamically
            Class<?> cls = Class.forName(className);

            System.out.println("\n--- Class: " + cls.getName() + " ---");

            // 1. Get Constructors
            System.out.println("\n[Constructors]");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println("  " + Modifier.toString(c.getModifiers()) + " " + c.getName());
            }

            // 2. Get Fields
            System.out.println("\n[Fields]");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println("  " + Modifier.toString(f.getModifiers()) + " " + 
                                   f.getType().getSimpleName() + " " + f.getName());
            }

            // 3. Get Methods
            System.out.println("\n[Methods]");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println("  " + Modifier.toString(m.getModifiers()) + " " + 
                                   m.getReturnType().getSimpleName() + " " + m.getName());
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Error: Class not found. Please ensure you entered the full name correctly.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

class Person{
    private int age;
    private String name;
    Person(){}
     public Person(int age,String name){
        this.age = age;
        this.name = name;
     }
     public String getName(){
            return name;
     }
     public int getAge(){
        return age;
     }
}