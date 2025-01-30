package ru.skillbox.notification;


import java.util.List;

public class EmailNotification implements Notification {
    public String message;
    public String receivers;
    public EmailNotification(List<String> receivers, String message) {
        this.message =  "message: " + "<p>" + message + "</p>";
        this.receivers = "receivers: " + String.join(", ", receivers);
    }

    @Override
    public String formattedMessage() {
        return "EMAIL" + '\n' + "subject:" + subjectOrTitle + '\n' + receivers + '\n' + message;
    }
}
