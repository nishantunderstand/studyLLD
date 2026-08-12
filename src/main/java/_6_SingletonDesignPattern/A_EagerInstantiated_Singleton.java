package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:31:23
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class A_EagerInstantiatedSingleton {

    private static final A_EagerInstantiatedSingleton instance = new A_EagerInstantiatedSingleton();

    private A_EagerInstantiatedSingleton(){}

    private static A_EagerInstantiatedSingleton getInstance(){
        return instance;
    }
}
