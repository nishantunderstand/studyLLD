package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:23:20
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class C_LazyInstantiatedSingleton {
    private static C_LazyInstantiatedSingleton instance;
    private C_LazyInstantiatedSingleton(){}
    public static C_LazyInstantiatedSingleton getInstance(){
        if(instance==null){
            instance = new C_LazyInstantiatedSingleton();
        }
        return instance;
    }
}
