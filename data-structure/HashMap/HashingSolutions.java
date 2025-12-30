import java.util.*;

public class HashingSolutions {
                                  
    // 1. Find All Subarrays with Zero Sum
    public static void findAllSubarraysWithZeroSum(int[] arr) {
        // Map: Cumulative Sum -> List of indices where this sum occurred
        Map<Integer, List<Integer>> map = new HashMap<>();
        int cumulativeSum = 0;

        // Initialize for subarrays starting from index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        System.out.println("Subarrays with Zero Sum:");
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (map.containsKey(cumulativeSum)) {
                List<Integer> indices = map.get(cumulativeSum);
                for (Integer prevIndex : indices) {
                    System.out.println("Range: [" + (prevIndex + 1) + ", " + i + "]");
                }
            }
            map.computeIfAbsent(cumulativeSum, k -> new ArrayList<>()).add(i);
        }
    }

    // 2. Check for a Pair with Given Sum (Returns boolean)
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> visited = new HashSet<>();
        for (int num : arr) {
            if (visited.contains(target - num)) return true;
            visited.add(num);
        }
        return false;
    }

    // 3. Longest Consecutive Sequence
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;
        for (int num : nums) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }

    // 4. Two Sum Problem (Returns indices)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}