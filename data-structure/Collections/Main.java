import java.util.*;

public class Main {
    public static List<Integer> removeDuplicates(List<Integer> input) {
        // LinkedHashSet removes duplicates and preserves the order of arrival
        Set<Integer> set = new LinkedHashSet<>(input);
        
        // Convert back to a List and return
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(list);
        
        System.out.println(result); // Output: [3, 1, 2, 4]
    }
}