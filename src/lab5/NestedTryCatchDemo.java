package lab5;

import java.io.*;
class Enrollment {
    static void enroll(String name, int age) throws IllegalArgumentException, NumberFormatException {
        if (age < 18)
            throw new IllegalArgumentException("Age " + age + " is below minimum (18)");
        System.out.println(name + " enrolled successfully");
    }
    public static void main(String[] args) {
        enroll("Sam", 15); // throws IllegalArgumentException
        enroll("Riya", 20); // OK
    }
}