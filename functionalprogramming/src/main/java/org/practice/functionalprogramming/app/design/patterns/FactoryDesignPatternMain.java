package org.practice.functionalprogramming.app.design.patterns;

import java.util.function.Supplier;

public class FactoryDesignPatternMain {

    public static void main(String[] args) {

       Notification notification =  NotificationFactory.getNotification("EMAIL");
        notification.sendNotification();
    }
}

interface Notification{

    void sendNotification();
}

class Sms implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }
}

class Email implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Email sent");
    }
}

class Push implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Push notification sent");
    }
}

class NotificationFactory{

    public static Notification getNotification(String notificationType){
        Supplier<Notification> notification = null;

        switch (notificationType){
            case "EMAIL":
                notification = Email::new;
            case "SMS":
                notification = Sms::new;
            case "PUSH":
                notification = Push::new;
            default:
                notification = Sms::new;
        }

        return notification.get();

    }
}
