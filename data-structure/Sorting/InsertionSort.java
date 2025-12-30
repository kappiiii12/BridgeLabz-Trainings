public class InsertionSort {
    public static void sort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; ++i) {
            int key = ids[i];
            int j = i - 1;

            // Move elements of ids[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j = j - 1;
            }
            ids[j + 1] = key;
        }
    }
}