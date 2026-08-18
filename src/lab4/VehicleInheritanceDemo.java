package lab4;

//Create a Vehicle parent class with a protected brand field and a start() method.
//Create two child classes Car and Bike that extend Vehicle, each overriding the start()
//method with their own implementation using @Override annotation. In main(), demonstrate
//dynamic method dispatch by storing Car and Bike objects in Vehicle references and calling
//start() on each, showing that the correct overridden method is called at runtime.












class Vehicle {
    protected String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car: " + brand + " engine starting");
    }
}

class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Bike: " + brand + " pedal starting");
    }
}

public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Hero");

        v1.start();
        v2.start();
    }
}
