package lab6;

public class GenericsBasicDemo<T> {
    private T id;
    void store(T id) { this.id = id; }
    void display() {
        System.out.println(id.getClass());
        System.out.println("ID: " + id);
    }

    public static void main(String[] args){
        // Usage — each instance is independently type-safe
        GenericsBasicDemo<String> strGenericsBasicDemo = new GenericsBasicDemo<>();
        strGenericsBasicDemo.store("2082-A");
        strGenericsBasicDemo.display();

        GenericsBasicDemo<Integer> intGenericsBasicDemo = new GenericsBasicDemo<>();
        intGenericsBasicDemo.store(2);
        intGenericsBasicDemo.display();
    }
}
