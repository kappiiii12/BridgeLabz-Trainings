import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // 1. Calculate Union (A ∪ B)
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);

        // 2. Calculate Intersection (A ∩ B)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // 3. Remove Intersection from Union
        symmetricDiff.removeAll(intersection);

        System.out.println("Symmetric Difference: " + symmetricDiff); 
        // Output: [1, 2, 4, 5]
    }
}