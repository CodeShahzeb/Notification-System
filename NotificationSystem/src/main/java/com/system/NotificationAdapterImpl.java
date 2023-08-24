package com.system;

// Adapter Pattern: Adapter
class NotificationAdapterImpl implements NotificationAdapter {
    @Override
    public void sendNotification(String channel, String to, String subject, String message) {
        NotificationFactory factory;
        if ("Email".equalsIgnoreCase(channel)) {
            factory = new EmailNotificationFactory();
        } else if ("SMS".equalsIgnoreCase(channel)) {
            factory = new SMSNotificationFactory();
        } else {
            throw new IllegalArgumentException("Unsupported channel: " + channel);
        }

        NotificationSender sender = factory.createSender();
        sender.send(to, subject, message);
    }
}
