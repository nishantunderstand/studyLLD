package _4d_SOLID_DI_vs_DIP_Bad;

class PaymentService {

    private RazorpayPayment payment = new RazorpayPayment();

    public void pay() {
        payment.process();
    }
}