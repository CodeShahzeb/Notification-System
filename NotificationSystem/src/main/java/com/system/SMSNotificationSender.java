package com.system;

class SMSNotificationSender implements NotificationSender {
    @Override
    public void send(String to, String subject, String message) {
        System.out.println("Sending SMS to: " + to);
        System.out.println("Message: " + message);
        System.out.println("SMS sent.");
    }
}