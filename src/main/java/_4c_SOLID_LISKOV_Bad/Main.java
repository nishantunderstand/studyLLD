package _4c_SOLID_LISKOV_Bad;

public class Main {
    public static void main(String[] args) {
        // Liskov Subustion Principle
        Animal ad = new Dog();
        ad.eat();

        // Runtime Polymorphism : Working : Yes
        // Is my code Following Liskov Subustion Princple : NOOOOO
        // We should be able to use child class in place of parent But it break
    }
}