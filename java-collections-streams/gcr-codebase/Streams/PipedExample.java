import java.io.*;

public class PipedExample {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);

        Thread writerThread = new Thread(() -> {
            try {
                pos.write("Hello from Thread 1".getBytes());
                pos.close();
            } catch (IOException e) {}
        });

        Thread readerThread = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) System.out.print((char) data);
                pis.close();
            } catch (IOException e) {}
        });

        writerThread.start();
        readerThread.start();
    }
}