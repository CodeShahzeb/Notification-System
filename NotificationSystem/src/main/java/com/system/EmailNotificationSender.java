package com.system;

// Factory Pattern: Concrete Products
class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String to, String subject, String message) {
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        System.out.println("Email sent.");
    }
}