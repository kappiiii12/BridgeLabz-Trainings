public class StringBenchmark {
    public static void main(String[] args) {
        int n = 100000;

        // String Concatenation
        long start = System.currentTimeMillis();
        String s = "";
        for(int i=0; i<n/5; i++) s += "a"; // Reduced n because String is very slow
        System.out.println("String time: " + (System.currentTimeMillis() - start) + "ms");

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) sb.append("a");
        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - start) + "ms");
    }
}