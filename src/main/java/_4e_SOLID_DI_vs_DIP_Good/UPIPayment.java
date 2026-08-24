package _4e_SOLID_DI_vs_DIP_Good;

public class UPIPayment implements PaymentGateway{

    @Override
    public void pay() {
        System.out.println("UPI Payment Gateway");
    }
}
