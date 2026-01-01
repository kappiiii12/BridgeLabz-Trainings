import java.io.*;

public class FileReadBenchmark {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (!file.exists()) return;

        long start = System.currentTimeMillis();
        try (FileReader fr = new FileReader(file)) {
            while (fr.read() != -1);
        }
        System.out.println("FileReader Time: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file))) {
            while (isr.read() != -1);
        }
        System.out.println("InputStreamReader Time: " + (System.currentTimeMillis() - start) + "ms");
    }
}