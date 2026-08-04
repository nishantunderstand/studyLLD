package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:28:21
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 */
public class DoubleCheckingSingleton {
    private static volatile DoubleCheckingSingleton instance;
    private DoubleCheckingSingleton(){}
    public static DoubleCheckingSingleton getInstance(){
        if(instance==null){
            synchronized(DoubleCheckingSingleton.class){
                if(instance==null){
                    instance = new DoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }
}
