package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:28:21
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class E_LazyInstantiatedDoubleCheckingSingleton {

    private static volatile E_LazyInstantiatedDoubleCheckingSingleton instance;

    private E_LazyInstantiatedDoubleCheckingSingleton(){}

    public static E_LazyInstantiatedDoubleCheckingSingleton getInstance(){
        if(instance==null){

            synchronized(E_LazyInstantiatedDoubleCheckingSingleton.class){  //<--

                if(instance==null){
                    instance = new E_LazyInstantiatedDoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }
}
