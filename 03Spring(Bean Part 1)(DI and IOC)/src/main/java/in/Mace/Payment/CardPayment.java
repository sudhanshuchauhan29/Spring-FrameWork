package in.Mace.Payment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
//@Qualifier("cp")
public class CardPayment implements PaymentService{
    public void pay()
    {
        System.out.println("Pay By Card");
    }
}
