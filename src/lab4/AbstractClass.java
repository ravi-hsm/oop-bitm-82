package lab4;

abstract class Shape {
    String color;
    abstract double area(); // must override
    void display() {
        System.out.println("Color: " + color);
    }
}
class Circle extends Shape {
    double radius;
    Circle(String c, double r) {
        color = c;
        radius = r;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
}

public class AbstractClass {
    public static void main(String args[]){
        Circle circle = new Circle("Red", 7);
        System.out.println(circle.area());
        circle.display();
    }
}
