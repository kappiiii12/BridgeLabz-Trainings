public class CountingSort {
    public static void sort(int[] ages) {
        int n = ages.length;
        if (n == 0) return;

        // Find range (Ages 10 to 18)
        int max = 18;
        int min = 10;
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[n];

        // Store count of each age
        for (int i = 0; i < n; i++) {
            count[ages[i] - min]++;
        }

        // Change count[i] so that it contains actual position in output
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        // Copy output array to ages
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }
}