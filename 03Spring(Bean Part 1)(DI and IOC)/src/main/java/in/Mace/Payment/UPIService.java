package in.Mace.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier
public class UPIService implements PaymentService {
    public void pay()
    {
        System.out.println("Pay By UPI");
    }
}
