import java.lang.reflect.Field;

public class PrivateAccessDemo {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person();

            // 1. Get the Class object
            Class<?> personClass = person.getClass();

            // 2. Locate the private field "age"
            Field ageField = personClass.getDeclaredField("age");

            // 3. Bypass the "private" restriction
            ageField.setAccessible(true);

            // 4. Retrieve the current value
            int currentAge = (int) ageField.get(person);
            System.out.println("Original Private Age: " + currentAge);

            // 5. Modify the value
            ageField.set(person, 35);
            
            // 6. Verify the change
            int updatedAge = (int) ageField.get(person);
            System.out.println("Modified Private Age: " + updatedAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class Person {
    private int age = 20; // Private field
}