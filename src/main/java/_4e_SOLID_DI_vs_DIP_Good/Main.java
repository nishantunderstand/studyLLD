package _4e_SOLID_DI_vs_DIP_Good;

public class Main {

    public static void main(String[] args) {

        // 1. Create dependency
        //PaymentGateway gateway = new RazorpayPayment();
        PaymentGateway gateway = new UPIPayment();
        // Dynamic Method Dispact + Liskov Subustition Principle

        // 2. Inject dependency
        PaymentService service = new PaymentService(gateway);

        // 3. Use service
        service.pay();
    }
}

/**
 *
 * PaymentGateway gateway = new UPIPayment();
 *              │                 │
 *              │                 └── LSP
 *              │
 *              └── Abstraction
 *                     ↓
 *                    DIP
 *
 *
 * PaymentService service = new PaymentService(gateway);
 *                            │
 *                            └── Dependency Injection
 *                                (Constructor Injection)
 *
 *
 * service.pay()
 *      ↓
 * gateway.pay()
 *      ↓
 * UPIPayment.pay()
 *      ↓
 * Dynamic Method Dispatch
 *
 *
 *
 */