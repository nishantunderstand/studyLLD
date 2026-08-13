package _6_SingletonDesignPattern;

/**
 * Created : 2026-08-08 15:06:37
 */
// Double-Checking Lock
public class _SingletonPratice {
    private static volatile _SingletonPratice INSTANCE;
    private _SingletonPratice(){}
    private static _SingletonPratice getInstance(){
        if(INSTANCE==null){
            synchronized(_SingletonPratice.class){
                if(INSTANCE==null){
                    INSTANCE = new _SingletonPratice();
                }
            }
        }
        return INSTANCE;
    }
}
