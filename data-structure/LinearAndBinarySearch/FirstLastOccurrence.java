public class FirstLastOccurrence {
    public static int findOccurrence(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                res = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        System.out.println("First: " + findOccurrence(arr, 2, true));
        System.out.println("Last: " + findOccurrence(arr, 2, false));
    }
}