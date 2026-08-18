package lab3;

public class MethodOverloading {
    public static void orderPizza(int qty) {
        System.out.println("Customer: \"I want " + qty + " pizza\"");
        System.out.println("Shop: \"Got it! Making " + qty + " standard medium cheese pizzas...\"");
        for (int i = 1; i <= qty; i++) {
            System.out.println("  Pizza " + i + ": Medium, Cheese");
        }
    }

    public static void orderPizza(int qty, String size) {
        System.out.println("\nCustomer: \"I want " + qty + " " + size + " pizzas\"");
        System.out.println("Shop: \"Got it! Making " + qty + " " + size + " cheese pizzas...\"");
        for (int i = 1; i <= qty; i++) {
            System.out.println("  Pizza " + i + ": " + size + ", Cheese");
        }
    }

    public static void orderPizza(int qty, String size, String topping) {
        System.out.println("\nCustomer: \"I want " + qty + " " + size + " " + topping + " pizza\"");
        System.out.println("Shop: \"Got it! Making " + qty + " " + size + " " + topping + " pizzas...\"");
        for (int i = 1; i <= qty; i++) {
            System.out.println("  Pizza " + i + ": " + size + ", " + topping);
        }
    }

    public static void orderPizza(String topping, int qty) {
        System.out.println("\nCustomer: \"I want " + qty + " " + topping + " pizzas, large\"");
        System.out.println("Shop: \"Got it! Making " + qty + " large " + topping + " pizzas...\"");
        for (int i = 1; i <= qty; i++) {
            System.out.println("  Pizza " + i + ": Large, " + topping);
        }
    }

    public static void main(String[] args) {
        System.out.println("Same shop, same method (orderPizza), different inputs = different results!\n");

        orderPizza(1);
        orderPizza(2, "Large");
        orderPizza(1, "Medium", "Pepperoni");
        orderPizza("Mushroom", 1);
    }
}