package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-08 15:06:37
 */
// Double-Checking Lock
public class SingletonPratice {
    private static volatile SingletonPratice INSTANCE;
    private SingletonPratice(){}
    private static SingletonPratice getInstance(){
        if(INSTANCE==null){
            synchronized(SingletonPratice.class){
                if(INSTANCE==null){
                    INSTANCE = new SingletonPratice();
                }
            }
        }
        return INSTANCE;
    }
}
