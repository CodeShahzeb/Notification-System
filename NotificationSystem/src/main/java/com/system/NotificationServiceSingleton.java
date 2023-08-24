package com.system;

class NotificationServiceSingleton {
    private static final NotificationService INSTANCE = new NotificationService();

    private NotificationServiceSingleton() {
    }

    public static NotificationService getInstance() {
        return INSTANCE;
    }
}