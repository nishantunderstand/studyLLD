package _4e_SOLID_DI_vs_DIP_Good;

class RazorpayPayment implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("Payment using Razorpay");
    }
}