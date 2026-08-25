package _4e_SOLID_DependencyInversion_Good;

class StripePayment implements Payment {

    @Override
    public void process() {
        System.out.println("Payment processed using Stripe");
    }
}