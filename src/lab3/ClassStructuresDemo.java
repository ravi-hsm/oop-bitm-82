package lab3;

public class ClassStructuresDemo {
    static final int PRICE = 200;

    static void order(int... qty) {
        int total = 0;
        for (int q : qty) {
            total += q;
        }
        System.out.println("Total: " + total);
    }

    void localClassDemo() {
        final String id = "ORD001";

        class Order {
            void display() {
                System.out.println(
                        id + " - Order placed"
                );
            }
        }
        new Order().display();
    }

    public static void main(String[] args) {
        System.out.println("Final Variables: " + PRICE);

        System.out.println("Varargs:");
        order(1, 2, 3);

        System.out.println("Local Class:");
        new ClassStructuresDemo().localClassDemo();

        System.out.println("Anonymous Class:");
        new Runnable() {
            public void run() {
                System.out.println("Pizza ready");
            }
        }.run();
    }
}
