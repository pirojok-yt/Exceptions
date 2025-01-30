package ru.skillbox.notification_sender;

import lombok.Setter;
import ru.skillbox.notification.EmailNotification;

import java.util.List;
@Setter
public class EmailNotificationSender implements NotificationSender<EmailNotification> {

    @Override
    public void send(List<EmailNotification> notifications) {
        for (EmailNotification notification : notifications) {
            System.out.println(notification.formattedMessage());
        }
    }

    @Override
    public void send(EmailNotification notification) {
        System.out.println(notification.formattedMessage());
    }
}
