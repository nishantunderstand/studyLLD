package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:36:12
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 * @see <a href="https://javaconceptoftheday.com/java-singleton-design-pattern-implementation-with-examples/">Singleton Design Pattern – JavaConceptOfTheDay</a>
 */
public class B_EagerInstantiatedStaticBlockSingleton {

    private static B_EagerInstantiatedStaticBlockSingleton instance;

    private B_EagerInstantiatedStaticBlockSingleton(){}

    static{
        try{
            instance = new B_EagerInstantiatedStaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception Occured in creating Singleton instance");
        }
    }

    public static B_EagerInstantiatedStaticBlockSingleton getInstance(){
        return  instance;
    }
}

