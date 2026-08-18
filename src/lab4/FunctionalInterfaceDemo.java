package lab4;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Add: " +
                add.operate(5, 3));
        System.out.println("Multiply: " +
                multiply.operate(5, 3));


        Calculator subtract = (a, b) -> a - b;
        Calculator divide = (a, b) -> a / b;
        System.out.println("Subtract: " +
                subtract.operate(5, 3));

        try{
            System.out.println("Divide: " +
                divide.operate(5, 0));
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }
}

