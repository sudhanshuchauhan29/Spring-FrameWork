package in.Mace;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService payment;

    public OrderService(@Lazy PaymentService payment){   //create orderservice but not create its dependency  to sirf order service create hoga lekin uske liye paymentservice lazy honi chchiye

        this.payment =payment;
        System.out.println("OrderService Created!");

    }
    public void placeOrder(){
        payment.pay();
        System.out.println("Order Placed");

    }

}
