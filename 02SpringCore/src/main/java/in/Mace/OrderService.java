package in.Mace;

import in.Mace.Notification.EmailService;
import in.Mace.Notification.NotificationService;

public class OrderService {
    NotificationService send;
//    public OrderService(NotificationService send)
//    {
//        this.send=send;
//    }

    public void setSend(NotificationService send) {
        this.send = send;
    }

    public void placeOrder()
    {
        send.sendNotification();
        System.out.println("Order Placed!");
    }
}
