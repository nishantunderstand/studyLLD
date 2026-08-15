package _4d_SOLID_Interface_Good;  /**
 * Created : 2026-08-15 13:14:02
 */
public class Human implements Eatable, Sleepable, Workable{
    @Override
    public void eat() {
        System.out.println("Eating ....");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeping ....");
    }

    @Override
    public void work() {
        System.out.println("Working  ....");
    }
}
