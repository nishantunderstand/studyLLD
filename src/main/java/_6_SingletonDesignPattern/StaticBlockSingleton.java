package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-05 00:36:12
 *
 * @see <a href="https://blog.algomaster.io/p/singleton-design-pattern">Singleton Design Pattern – AlgoMaster</a>
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}

    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception Occured in creating Singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return  instance;
    }
}
