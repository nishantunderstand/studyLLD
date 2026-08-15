package _4b_SOLID_OpenClosed_Bad;

/**
 * Created : 2026-08-15 12:53:13
 */
public class Main {
    public static void main(String[] args) {
        PaymentService pay = new PaymentService();
        pay.pay("UPI");
        pay.pay("CARD");
        pay.pay("ATM");
    }
}
