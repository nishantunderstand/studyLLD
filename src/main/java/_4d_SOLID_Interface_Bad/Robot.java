package _4d_SOLID_Interface_Bad;

/**
 * Created : 2026-08-15 13:11:58
 */
public class Robot implements Worker{
    @Override
    public void work() {
        System.out.println("Working....");
    }

    @Override
    public void eat() {
        System.out.println("Uselesss ");
    }

    @Override
    public void sleep() {
        System.out.println("Useless....");
    }
}
