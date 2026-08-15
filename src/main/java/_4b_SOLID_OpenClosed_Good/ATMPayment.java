package _4b_SOLID_OpenClosed_Good;

/**
 * Created : 2026-08-15 12:55:29
 */
public class ATMPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("ATM Payment.....");
    }
}
