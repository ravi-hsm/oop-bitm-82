package lab9;

import java.io.Console;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        // Using Scanner (works everywhere)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        // Using Console (only works in a real terminal, not all IDEs)
        Console console = System.console();
        if (console != null) {
            String city = console.readLine("Enter your city: ");
            console.printf("You live in %s%n", city);
        } else {
            System.out.println("Console not available in this environment.");
        }
    }
}

