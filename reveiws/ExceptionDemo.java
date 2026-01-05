package reveiws;
public class ExceptionDemo {
    public static void main(String[] args) {
        // Test Case 1: Division by Zero
        calculate(10, 0);

        // Test Case 2: Null Input
        calculate(null, 5);
        
        // Test Case 3: Valid Input
        calculate(20, 4);
    }

    public static void calculate(Integer a, Integer b) {
        try {
            // This might throw NullPointerException if 'a' or 'b' is null
            // This might throw ArithmeticException if 'b' is 0
            int result = a / b; 
            System.out.println("Result: " + result);

        } catch (NullPointerException e) {
            System.err.println("Error: One of the inputs is null.");
            
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero.");
            
        } catch (Exception e) {
            System.err.println("Error: An unexpected error occurred: " + e.getMessage());
            
        } finally {
            System.out.println("Operation attempt finished.");
            System.out.println("---");
        }
    }
}