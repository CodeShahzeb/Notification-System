package com.system;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main( String[] args )
    {
        NotificationFacade notificationFacade = new NotificationFacade();
        String channel = "Email";
        String subject =  "Important Update";
        String message = " Hello! We have an important update for you";

        // Mocked user data
        List<User> users = getUsers();

        for (User user : users) {
            String to = channel.equalsIgnoreCase("Email") ? user.getEmail() : user.getPhoneNumber();
            notificationFacade.sendNotification(channel, to, subject, message);
        }
    }

    private static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("user1@example.com", "1234567890"));
        users.add(new User("user2@example.com", "9876543210"));
        // Add more users as needed
        return users;
    }
}
