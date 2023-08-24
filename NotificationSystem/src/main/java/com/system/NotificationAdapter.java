package com.system;

// Adapter Pattern: Target
interface NotificationAdapter {
    void sendNotification(String channel, String to, String subject, String message);
}