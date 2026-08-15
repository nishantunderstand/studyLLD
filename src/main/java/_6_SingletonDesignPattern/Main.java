package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-15 12:16:00
 */


public class Main {
    public static void main(String[] args) {

        G_EnumSingleton obj1 = G_EnumSingleton.INSTANCE;
        G_EnumSingleton obj2 = G_EnumSingleton.INSTANCE;

        System.out.println(obj1 == obj2); // true

        obj1.doSomething();
    }
}
