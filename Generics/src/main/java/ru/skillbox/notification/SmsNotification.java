package ru.skillbox.notification;

import java.util.List;

public class SmsNotification implements Notification {

    public String message;
    public String receivers;
    public SmsNotification(List<String> receivers, String message) {
        this.message =  "message: " + message;
        this.receivers = "receivers: " + String.join(", ", receivers);
    }

    @Override
    public String formattedMessage() {
        return "SMS" + '\n' + receivers + '\n' + message;
    }
}
