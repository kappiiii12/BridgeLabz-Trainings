public class FibonacciBenchmark {
    public static long recursive(int n) {
        if (n <= 1) return n;
        return recursive(n - 1) + recursive(n - 2);
    }

    public static long iterative(int n) {
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 40; 
        long start = System.currentTimeMillis();
        recursive(n);
        System.out.println("Recursive (n=40): " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        iterative(n);
        System.out.println("Iterative (n=40): " + (System.currentTimeMillis() - start) + "ms");
    }
}