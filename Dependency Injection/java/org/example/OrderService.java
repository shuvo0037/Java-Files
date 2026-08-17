package org.example;

import NotificationService.EmailNotification;
import NotificationService.Notification;


public class OrderService {
    Notification Notification = new EmailNotification();
    void placeOrder(){
        System.out.println("Order Placed");
        Notification.sendNotification();


    }
}
