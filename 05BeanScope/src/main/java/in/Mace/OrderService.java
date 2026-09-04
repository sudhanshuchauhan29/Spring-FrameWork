package in.Mace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")  //prototype scope->lazy initialization
                        // singleton scope->Eager Initialization
public class OrderService {
    public OrderService(){
        System.out.println("OrderService Created");
    }
//    @Autowired
//    private PaymentService payment;
////    public OrderService(PaymentService payment) {
////        this.payment = payment;
////    }
    public void placeOrder(){
//        payment.pay();
//        getOrderDetails();
        System.out.println("Order Placed");
    }
//public void getOrderDetails(){
//    System.out.println("Get details");
//}

}
