package lab9;

import java.io.*;

public class RandomAccessDemo {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            raf.writeInt(10);
            raf.writeInt(20);
            raf.writeInt(30);

            raf.seek(4); // jump to the second int
            System.out.println("Value at position 4: " + raf.readInt());

            raf.seek(0);
            System.out.println("Value at position 0: " + raf.readInt());
        }
    }
}
