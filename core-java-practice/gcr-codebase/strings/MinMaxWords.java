public class MinMaxWords {
    public static void main(String[] args) {
        // ... (Input and 2D Array generation same as above)
        String[][] wordData = {{"Java", "4"}, {"is", "2"}, {"Powerful", "8"}};
        int[] indices = findShortestLongest(wordData);
        
        System.out.println("Shortest: " + wordData[indices[0]][0]);
        System.out.println("Longest: " + wordData[indices[1]][0]);
    }

    public static int[] findShortestLongest(String[][] data) {
        int minIdx = 0, maxIdx = 0;
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int currentLen = Integer.parseInt(data[i][1]);
            if (currentLen < min) { min = currentLen; minIdx = i; }
            if (currentLen > max) { max = currentLen; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }
}