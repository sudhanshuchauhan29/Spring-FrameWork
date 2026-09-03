package in.Mace;

import in.Mace.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
//    @Autowired
    PaymentService payment;
//    @Autowired
    public OrderService(PaymentService payment) {
        this.payment = payment;
    }
//@Autowired
//public void setPayment(PaymentService payment) { //if we use Qualifier in place of primary then we have to put @Qualifier("cardPayment") PaymentServire payment
//    this.payment = payment;  //we can also make a name of Qualifier and then use it in ""
//}
    public void display()
    {
        payment.pay();
        System.out.println("Order done");
    }
}
