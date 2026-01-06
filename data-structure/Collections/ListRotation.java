import java.util.*;

public class ListRotation {
    public static void rotate(List<Integer> nums, int k) {
        int n = nums.size();
        if (n == 0) return;
        
        // Handle cases where k > n
        k = k % n; 
        if (k == 0) return;

        // Step 1: Reverse first k elements
        Collections.reverse(nums.subList(0, k));
        // Step 2: Reverse remaining elements
        Collections.reverse(nums.subList(k, n));
        // Step 3: Reverse the whole list
        Collections.reverse(nums);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotate(list, 2);
        System.out.println(list); // Output: [30, 40, 50, 10, 20]
    }
}