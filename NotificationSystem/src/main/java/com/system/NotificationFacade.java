package com.system;

// Facade Pattern
class NotificationFacade {
    private NotificationService notificationService = NotificationServiceSingleton.getInstance();
    private NotificationAdapter adapter = new NotificationAdapterImpl();

    public void sendNotification(String channel, String to, String subject, String message) {
        adapter.sendNotification(channel, to, subject, message);
        notificationService.notifySubscribers("Notification sent to " + to + " via " + channel);
    }
}