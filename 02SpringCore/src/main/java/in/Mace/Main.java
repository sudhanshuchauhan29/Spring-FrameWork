package in.Mace;

import in.Mace.Notification.EmailService;
import in.Mace.Notification.NotificationService;
import in.Mace.Notification.PopUpService;

import javax.management.Notification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        NotificationService send = new EmailService();
//        OrderService order = new OrderService(send);
//        OrderService order2 = new OrderService(new PopUpService());
//        order.placeOrder();
//        order2.placeOrder();
        NotificationService send = new EmailService();
        OrderService order = new OrderService();
        order.setSend(send);// seting the send
        order.placeOrder(); //required to place the order
//        System.out.printf("Hello and welcome!");
    }
}
// Main method injecting Dependency
