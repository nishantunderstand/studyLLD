package _4e_SOLID_DependencyInversion;

/**
 * Created : 2026-08-15 13:25:32
 */
public class Car {
    private Engine engine;
    // This is like Constructor Injection
    public Car(Engine engine){
        this.engine = engine;
    }
    void startCar(){
        engine.start();
    }
}
