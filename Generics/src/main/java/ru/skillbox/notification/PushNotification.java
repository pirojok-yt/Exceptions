package ru.skillbox.notification;

import java.util.List;

public class PushNotification implements Notification {

    public String message;
    public String receivers;
    public PushNotification(List<String> receivers, String message) {
        this.message =  "message: " + "\uD83D\uDC4B" + message;
        this.receivers = "receivers: " + String.join(", ", receivers);
    }

        @Override
    public String formattedMessage() {
        return "PUSH" + '\n' + "title: " + subjectOrTitle + '\n' + receivers + '\n' + message;
    }
}
