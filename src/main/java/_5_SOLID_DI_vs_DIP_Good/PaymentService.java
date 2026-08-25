package _5_SOLID_DI_vs_DIP_Good;

public class PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void pay(){
        paymentGateway.pay();
    }
}
