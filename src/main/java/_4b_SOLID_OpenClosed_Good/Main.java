package _4b_SOLID_OpenClosed_Good;

/**
 * Created : 2026-08-15 12:55:56
 */
public class Main {
    public static void main(String[] args) {
        PaymentService payment = new PaymentService();
        payment.pay(new ATMPayment());
        payment.pay(new UPIPayment());
        payment.pay(new ATMPayment());
    }
}


/**
 * How to Implement a Open Closed Principle
 * Create a Interface ,and SubClass which will implement them
 *
 *
 *               Payment (Interface)
 *                     ↑
 *        ┌────────────┼────────────┐
 *        ↑            ↑            ↑
 *      UPI           Card          ATM
 *    Payment       Payment       Payment
 *
 *                     ↓
 *              PaymentService
 *                     ↓
 *           accepts Payment
 *
 *
 */