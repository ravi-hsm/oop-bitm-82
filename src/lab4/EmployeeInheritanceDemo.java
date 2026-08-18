package lab4;
//Create an Employee parent class with protected name and salary fields. Create Manager
//and Developer child classes that override the calculateBonus() and work() methods with
//different implementations (Manager bonus = 10%, Developer bonus = 8%). In main(), use
//Employee references to store Manager and Developer objects and call both methods,
//demonstrating that the correct overridden method runs based on the actual object type
//(polymorphism/dynamic dispatch). Also use super() in child constructors to initialize parent fields.
class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    double calculateBonus() {
        return salary * 0.05;
    }
    void work() {
        System.out.println(name + " working");
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    void work() {
        System.out.println(name + " managing team");
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.08;
    }

    @Override
    void work() {
        System.out.println(name + " coding");
    }
}

public class EmployeeInheritanceDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager("Raj", 80000);
        Employee e2 = new Developer("Priya", 60000);

        e1.work();
        e2.work();

        System.out.println("Manager bonus: " + e1.calculateBonus());
        System.out.println("Developer bonus: " + e2.calculateBonus());
    }
}
