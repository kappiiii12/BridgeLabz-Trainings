import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store: Key = Number, Value = Index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in our map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // If not found, add the current number and index to the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[] {};
    }
}