import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations math = new MathOperations();

        try {
            System.out.println("Available: add, subtract, multiply");
            System.out.print("Enter method name: ");
            String methodName = scanner.nextLine().trim();

            System.out.print("Enter two numbers (space separated): ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // 1. Get the class object
            Class<?> cls = math.getClass();

            // 2. Dynamically find the method by name and parameter types
            Method method = cls.getMethod(methodName, int.class, int.class);

            // 3. Invoke the method on our 'math' instance
            Object result = method.invoke(math, num1, num2);

            System.out.println("Result of " + methodName + ": " + result);

        } catch (NoSuchMethodException e) {
            System.err.println("Error: That operation does not exist.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}