package NotificationService;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification(){
        System.out.println("Email Send");
    }
}
