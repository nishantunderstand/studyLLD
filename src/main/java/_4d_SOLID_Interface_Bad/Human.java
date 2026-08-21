package _4e_SOLID_Interface_Bad;

/**
 * Created : 2026-08-15 13:11:19
 */
public class Human implements Worker{
    @Override
    public void work() {
        System.out.println("Working....");
    }

    @Override
    public void eat() {
        System.out.println("Eating ....");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping ....");
    }
}
