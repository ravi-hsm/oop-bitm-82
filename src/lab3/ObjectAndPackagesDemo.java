package lab3;

import java.util.ArrayList;

public class ObjectAndPackagesDemo {
    static class Pizza {
        String type;
        Pizza(String type) {
            this.type = type;
        }
        public String toString() {
            return type;
        }
        public boolean equals(Object obj) {
            boolean isPizza = obj instanceof Pizza;
            boolean isSameType = this.type.equals(
                    (
                            (Pizza)obj
                    ).type
            );
            return isPizza && isSameType;
        }
    }

    public static void main(String[] args) {
        System.out.println("Import ArrayList:");
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Cheese");
        System.out.println(menu);

        System.out.println("\nType of p1 pizza:");
        Pizza p1 = new Pizza("Pepperoni");
        System.out.println(p1);

        System.out.println("\nType of p1 pizza and p2 pizza same?");
        Pizza p2 = new Pizza("Pepperoni");
        System.out.println(p1.equals(p2));

        System.out.print("\nHashCode of p1: ");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.print("\nGet Class Name:");
        System.out.println(p1.getClass().getSimpleName());

        System.out.println("Garbage Collection:");
        p1 = null;
        p2 = null;
        System.gc();

        System.out.println("\n p1 after Garbage Collection:");
        System.out.println(p1);
    }
}
