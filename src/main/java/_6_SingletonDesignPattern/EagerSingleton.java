package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:31:23
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    private static EagerSingleton getInstance(){
        return instance;
    }
}
