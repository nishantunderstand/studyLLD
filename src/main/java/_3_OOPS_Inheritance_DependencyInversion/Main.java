package _4e_SOLID_DependencyInversion;

/**
 * Created : 2026-08-15 13:27:49
 */
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.startCar();
    }
}


/**
 * IS-A    → Inheritance
 *           Dog IS-A Animal
 *
 * HAS-A   → Composition/Aggregation
 *           Car HAS-A Engine
 *
 * USES-A  → Dependency
 *           Car USES-A Engine
 *
 *
 */