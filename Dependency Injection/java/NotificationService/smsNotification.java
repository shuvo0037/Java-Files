package NotificationService;


public class smsNotification implements Notification {
  @Override
    public  void sendNotification(){
        System.out.println("SMS send");
    }
}
