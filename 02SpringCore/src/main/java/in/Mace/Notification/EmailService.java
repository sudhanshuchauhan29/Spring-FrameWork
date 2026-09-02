package in.Mace.Notification;

public class EmailService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Eamil send");
    }
}
