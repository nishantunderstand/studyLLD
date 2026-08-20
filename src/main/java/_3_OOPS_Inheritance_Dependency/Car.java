package _3_OOPS_Inheritance_Dependency;


// _3_OOPS_Inheritance_Dependency;
/**
 * Created : 2026-08-15 13:18:02
 */
public class Car {
    private Engine engine = new Engine();
    void startCar(){
        engine.start();
    }
}


/**
 * Car → depends on → Engine
 */

// Here Car Own the Engine