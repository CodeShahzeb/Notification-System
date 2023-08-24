package com.system;

interface NotificationSender {
    void send(String to, String subject, String message);
}