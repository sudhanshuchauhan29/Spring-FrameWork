package in.Mace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class); // it creates orderservice created
//        PaymentService pay = context.getBean(PaymentService.class);
        order.placeOrder(); //jab ye call hoga to orderservice ko paymentservice ki jaroorat pdegi to vo payment service ka bhi bean bna dega
        

    }
}