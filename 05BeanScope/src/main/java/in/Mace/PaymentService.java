package in.Mace;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
//    @Autowired
    OrderService orderr;

//    public PaymentService(OrderService orderr) {
//        this.orderr = orderr;
//    }

    public void pay(){
        System.out.println("Payment done");
        // not its responsibility
        //orderr.getOrderDetails();
    }
}
