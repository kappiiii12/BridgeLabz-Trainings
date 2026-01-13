import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        File input = new File("input.jpg");
        try (FileInputStream fis = new FileInputStream(input);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int read;
            while ((read = fis.read(buffer)) != -1) baos.write(buffer, 0, read);

            byte[] imageBytes = baos.toByteArray();

            try (FileOutputStream fos = new FileOutputStream("output.jpg");
                 ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes)) {
                int b;
                while ((b = bais.read()) != -1) fos.write(b);
            }
            System.out.println("Image processed successfully.");
        } catch (IOException e) { e.printStackTrace(); }
    }
}