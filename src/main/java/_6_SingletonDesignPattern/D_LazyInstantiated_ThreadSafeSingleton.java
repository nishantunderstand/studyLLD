package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:26:14
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class D_LazyInstantiatedThreadSafeSingleton {

    private static D_LazyInstantiatedThreadSafeSingleton instance;

    private D_LazyInstantiatedThreadSafeSingleton(){}

    public static synchronized D_LazyInstantiatedThreadSafeSingleton getInstance(){
        if(instance==null){
            instance = new D_LazyInstantiatedThreadSafeSingleton();
        }
        return instance;
    }

}
