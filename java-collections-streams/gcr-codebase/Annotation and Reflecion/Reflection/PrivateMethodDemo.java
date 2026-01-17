import java.lang.reflect.Method;

public class PrivateMethodDemo {
    public static void main(String[] args) {
        try {
            // 1. Create an instance of the class
            Calculator calc = new Calculator();

            // 2. Get the Class object
            Class<?> calcClass = calc.getClass();

            // 3. Access the private method "multiply"
            // Note: We must specify the parameter types (int.class) 
            // to identify the correct method signature.
            Method method = calcClass.getDeclaredMethod("multiply", int.class, int.class);

            // 4. Break the private access barrier
            method.setAccessible(true);

            // 5. Invoke the method
            // Parameters: (The object instance, argument 1, argument 2)
            Object result = method.invoke(calc, 6, 7);

            System.out.println("The result of the private multiply method is: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}