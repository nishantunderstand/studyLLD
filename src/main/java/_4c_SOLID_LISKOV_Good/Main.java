package _4c_SOLID_LISKOV_Good;

public class Main {
    public static void main(String[] args) {
        // Seperate Object
        Animal a1 = new Animal();
        a1.eat();

        System.out.println("====== Sunday, August 2, 2026 8:52:05 PM ======\n");
        // Seperate Object
        Dog d1 = new Dog();
        d1.eat();

        System.out.println("====== Sunday, August 2, 2026 8:54:15 PM ======\n");

        // Liskov Subustion Principle
        Animal ad = new Dog();
        ad.eat();

        // Don't you think is Inheritance + RunTime Polymorphism
        // Dymanic Method Dispatch Propety


    }
}

/**
 * LISKOV Subsition
 * A child class should be replaceable by its parent without breaking the program.
 */