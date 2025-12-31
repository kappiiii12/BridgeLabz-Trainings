import java.util.Arrays;

public class CombinedChallenge {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 2];
        for (int x : nums) {
            if (x > 0 && x <= n) present[x] = true;
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!present[i]) return i;
        }
        return 1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}