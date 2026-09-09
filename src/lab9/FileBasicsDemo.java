package lab9;

import java.io.File;
import java.io.IOException;

public class FileBasicsDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");

        if (f.createNewFile()) {
            System.out.println("File created: " + f.getName());
        } else {
            System.out.println("File already exists.");
        }

        System.out.println("Path: " + f.getAbsolutePath());
        System.out.println("Size: " + f.length() + " bytes");

        // List files in current directory
        File dir = new File(".");
        String[] files = dir.list();
        System.out.println("Files in current directory:");
        for (String name : files) {
            System.out.println(" - " + name);
        }

//        f.delete();
//        System.out.println("File deleted.");
    }
}