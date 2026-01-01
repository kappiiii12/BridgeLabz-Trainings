import java.util.Arrays;

public class SortBenchmark {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] data = new int[10000]; // Keep small for Bubble Sort
        for(int i=0; i<data.length; i++) data[i] = (int)(Math.random() * 10000);

        int[] copy1 = data.clone();
        long start = System.currentTimeMillis();
        bubbleSort(copy1);
        System.out.println("Bubble Sort (10k): " + (System.currentTimeMillis() - start) + "ms");

        int[] copy2 = data.clone();
        start = System.currentTimeMillis();
        Arrays.sort(copy2); // Dual-Pivot Quicksort
        System.out.println("Quick/Merge Sort (10k): " + (System.currentTimeMillis() - start) + "ms");
    }
}