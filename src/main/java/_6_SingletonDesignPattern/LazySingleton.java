package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:23:20
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 */
public class LazySingleton {
    private static LazySingleton instance;
    private  LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
