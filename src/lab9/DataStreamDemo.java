package lab9;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"))) {
            dos.writeInt(100);
            dos.writeDouble(45.75);
            dos.writeBoolean(true);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))) {
            System.out.println("Int: " + dis.readInt());
            System.out.println("Double: " + dis.readDouble());
            System.out.println("Boolean: " + dis.readBoolean());
        }
    }
}

