package in.Mace;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Manually dependency injection
//        PaymentService payment = new PaymentService();
//        OrderService order = new OrderService(payment);
//        order.display();
        // We used configuration and component for this
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        order.display();
        User user = context.getBean(User.class);
        System.out.println(user.getName());
    }
}