import java.util.Arrays;

public class SearchBenchmark {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 1000000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) data[i] = i;

        long start = System.nanoTime();
        linearSearch(data, size - 1);
        System.out.println("Linear Search: " + (System.nanoTime() - start) / 1e6 + "ms");

        start = System.nanoTime();
        binarySearch(data, size - 1);
        System.out.println("Binary Search: " + (System.nanoTime() - start) / 1e6 + "ms");
    }
}