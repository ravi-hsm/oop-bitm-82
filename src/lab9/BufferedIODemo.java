package lab9;

import java.io.*;

public class BufferedIODemo {
    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("log.txt")))) {
            pw.println("Line 1");
            pw.printf("Score: %d%n", 95);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        }
    }
}