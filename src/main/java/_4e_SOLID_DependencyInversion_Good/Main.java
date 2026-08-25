package _4e_SOLID_DependencyInversion_Good;

public class Main {

    public static void main(String[] args) {
        Payment payment = new RazorpayPayment();
        PaymentService service = new PaymentService(payment);
        service.pay();
    }
}