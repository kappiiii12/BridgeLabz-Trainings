import java.util.*;

public class DataStructureSolutions {

    // 1. Implement a Queue Using Two Stacks
    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Enqueue: Push element to s1 - O(1)
        public void enqueue(int x) {
            s1.push(x);
        }

        // Dequeue: Pop from s2. If s2 is empty, move all from s1 - Amortized O(1)
        public int dequeue() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) s2.push(s1.pop());
            }
            return s2.isEmpty() ? -1 : s2.pop();
        }
    }

    // 2. Sort a Stack Using Recursion
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertSorted(stack, element);
            stack.push(temp);
        }
    }

    // 3. Stock Span Problem
    public static int[] calculateSpan(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> s = new Stack<>(); // Stores indices

        for (int i = 0; i < prices.length; i++) {
            while (!s.isEmpty() && prices[s.peek()] <= prices[i]) {
                s.pop();
            }
            span[i] = s.isEmpty() ? (i + 1) : (i - s.peek());
            s.push(i);
        }
        return span;
    }

    // 4. Sliding Window Maximum
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // Stores indices

        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) dq.pollFirst();
            
            // Remove elements smaller than current (they are no longer useful)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            
            dq.offerLast(i);
            if (i >= k - 1) result[i - k + 1] = nums[dq.peekFirst()];
        }
        return result;
    }

    // 5. Circular Tour Problem (Gas Station)
    public static int canCompleteCircuit(int[] petrol, int[] distance) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startStation = 0;

        for (int i = 0; i < petrol.length; i++) {
            int diff = petrol[i] - distance[i];
            totalSurplus += diff;
            currentSurplus += diff;

            // If we can't reach the next station
            if (currentSurplus < 0) {
                startStation = i + 1;
                currentSurplus = 0;
            }
        }
        return (totalSurplus >= 0) ? startStation : -1;
    }
}