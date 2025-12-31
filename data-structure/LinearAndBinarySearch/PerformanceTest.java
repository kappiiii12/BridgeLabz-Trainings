public class PerformanceTest {
    public static void main(String[] args) {
        int count = 1_000_000;

        // StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("h");
        long durationBuilder = System.nanoTime() - startTime;

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) sbf.append("h");
        long durationBuffer = System.nanoTime() - startTime;

        System.out.println("StringBuilder: " + (durationBuilder / 1_000_000.0) + " ms");
        System.out.println("StringBuffer: " + (durationBuffer / 1_000_000.0) + " ms");
    }
}