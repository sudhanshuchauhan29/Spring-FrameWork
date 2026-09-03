package in.Mace;

import in.Mace.Payment.CardPayment;
import in.Mace.Payment.PaymentService;
import in.Mace.Payment.UPIService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import javax.smartcardio.Card;

@Configuration
@ComponentScan("in.Mace")
public class AppConfig {
    @Bean
    public User creatUser()
    {
        return new User("Yashi",18);
    }
    @Bean
    @Primary
    public PaymentService cardPayment()
    {
        return new CardPayment();
    }
    @Bean
//    @Primary
    public PaymentService upiPayment()
    {
        return new UPIService();
    }
    @Bean //QUalifier("cardPayment") bean ka name in the start of parameter in below function
    public OrderService orderService(PaymentService payment) //PaymentService payment not used when using setter
    {
        return new OrderService(payment);
        //BY using setter in Order Service
//        PaymentService payment  =  cardPayment(); // by calling method creating a object of payment service of card type
//        OrderService order = new OrderService();
//        order.setPayment(payment);
//        return order;
    }
}
