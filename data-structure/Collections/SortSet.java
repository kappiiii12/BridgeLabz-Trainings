import java.util.*;

public class SortSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // 1. Convert Set to List
        List<Integer> list = new ArrayList<>(set);

        // 2. Sort the List
        Collections.sort(list);

        System.out.println(list); // Output: [1, 3, 5, 9]
    }
}