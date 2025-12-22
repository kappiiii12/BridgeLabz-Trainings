public class CharacterTypeTable {
    public static void main(String[] args) {
        String input = "Hello 123";
        String[][] table = getTypeTable(input);
        displayTable(table);
    }

    public static String[][] getTypeTable(String s) {
        String[][] table = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            table[i][0] = String.valueOf(s.charAt(i));
            table[i][1] = VowelConsonantCounter.checkChar(s.charAt(i));
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) System.out.println(row[0] + "\t" + row[1]);
    }
}