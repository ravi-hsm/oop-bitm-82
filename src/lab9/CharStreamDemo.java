package lab9;

import java.io.*;

public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("notes.txt")) {
            fw.write("Hello File Handling!\n");
            fw.write("Second line of text.\n");
        }

        try (FileReader fr = new FileReader("notes.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}