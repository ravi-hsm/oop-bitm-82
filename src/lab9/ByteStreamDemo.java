package lab9;

import java.io.*;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("bytes.bin")) {
            fos.write(72); // 'H'
            fos.write(73); // 'I'
        }

        try (FileInputStream fis = new FileInputStream("bytes.bin")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println("Byte: " + data + " -> " + (char) data);
            }
        }
    }
}
