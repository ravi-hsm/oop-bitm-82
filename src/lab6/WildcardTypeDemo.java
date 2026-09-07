package lab6;

import java.util.ArrayList;
import java.util.List;

public class WildcardTypeDemo {
    static double sumList(List<? extends Number> list) { // Integer, Double, Number or Object allowed
        double sum = 0;
        for (Number n : list)
            sum += n.doubleValue();
        return sum;
    }
    static void addIntegers(List<? super Integer> list) { // [5] // Integer, Number or Object allowed
        list.add(10); // [5, 10]
        list.add(20); // [5, 10, 20]
    }

    public static void main(String[] args) {
        WildcardTypeDemo demo = new WildcardTypeDemo();

        List<Integer> values = new ArrayList<>();
        values.add(5);

        demo.addIntegers(values);

        double sum = demo.sumList(values); // [5, 10, 20]
        System.out.println(sum);
    }
}
