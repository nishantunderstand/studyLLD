package _4e_SOLID_DependencyInversion_Good;

class RazorpayPayment implements Payment {

    @Override
    public void process() {
        System.out.println("Payment processed using Razorpay");
    }
}