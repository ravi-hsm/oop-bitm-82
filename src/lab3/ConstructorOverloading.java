package lab3;

public class ConstructorOverloading {
    String size;
    String topping;
    int quantity;

    public ConstructorOverloading(int qty) {
        this.quantity = qty;
        this.size = "Medium";
        this.topping = "Cheese";
        System.out.println("Constructor 1: " + qty + " pizza(s) ordered");
        System.out.println("  Default: " + size + ", " + topping + "\n");
    }

    public ConstructorOverloading(int qty, String size) {
        this.quantity = qty;
        this.size = size;
        this.topping = "Cheese";
        System.out.println("Constructor 2: " + qty + " " + size + " pizza(s) ordered");
        System.out.println("  Default topping: " + topping + "\n");
    }

    public ConstructorOverloading(int qty, String size, String topping) {
        this.quantity = qty;
        this.size = size;
        this.topping = topping;
        System.out.println("Constructor 3: " + qty + " " + size + " " + topping + " pizza(s) ordered");
        System.out.println("  All details set\n");
    }

    public ConstructorOverloading(String topping, int qty) {
        this.quantity = qty;
        this.size = "Large";
        this.topping = topping;
        System.out.println("Constructor 4: " + qty + " large " + topping + " pizza(s) ordered");
        System.out.println("  Size: " + size + ", Topping: " + topping + "\n");
    }

    public static void main(String[] args) {
        System.out.println("Same class, same constructor name, different inputs = different objects!\n");

        ConstructorOverloading order1 = new ConstructorOverloading(1);
        ConstructorOverloading order2 = new ConstructorOverloading(2, "Large");
        ConstructorOverloading order3 = new ConstructorOverloading(1, "Medium", "Pepperoni");
        ConstructorOverloading order4 = new ConstructorOverloading("Mushroom", 1);
    }
}