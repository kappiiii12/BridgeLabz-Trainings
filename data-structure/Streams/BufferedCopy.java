import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        String src = "large_file.dat";
        String dest = "copy_large_file.dat";

        // Performance test
        long start = System.nanoTime();
        copyBuffered(src, dest);
        long end = System.nanoTime();
        
        System.out.println("Buffered Copy Time: " + (end - start) / 1_000_000 + " ms");
    }

    public static void copyBuffered(String src, String dest) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}