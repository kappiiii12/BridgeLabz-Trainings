import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age and height for " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest friend: " + friends[findYoungestIndex(ages)]);
        System.out.println("Tallest friend: " + friends[findTallestIndex(heights)]);
        sc.close();
    }

    public static int findYoungestIndex(int[] ages) {
        int minIdx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIdx]) minIdx = i;
        }
        return minIdx;
    }

    public static int findTallestIndex(double[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIdx]) maxIdx = i;
        }
        return maxIdx;
    }
}