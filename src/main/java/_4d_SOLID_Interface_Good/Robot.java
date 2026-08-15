package _4d_SOLID_Interface_Good;

/**
 * Created : 2026-08-15 13:15:11
 */
public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Working.....");
    }
}


/**
 *
 *               Interfaces
 *                   |
 *        ┌──────────┼──────────┐
 *        ↓          ↓          ↓
 *    Workable    Eatable   Sleepable
 *        ↑          ↑          ↑
 *        |          |          |
 *      Human      Human      Human
 *        |
 *      Robot
 *
 *
 *
 */