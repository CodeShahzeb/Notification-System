package com.system;

// Factory Pattern: Concrete Factories
class EmailNotificationFactory implements NotificationFactory {
    @Override
    public NotificationSender createSender() {
        return new EmailNotificationSender();
    }
}