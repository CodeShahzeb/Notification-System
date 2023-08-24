package com.system;

class SMSNotificationFactory implements NotificationFactory {
    @Override
    public NotificationSender createSender() {
        return new SMSNotificationSender();
    }
}