package ru.skillbox.notification_sender;

import lombok.Setter;
import ru.skillbox.notification.PushNotification;

import java.util.List;
@Setter
public class PushNotificationSender implements NotificationSender<PushNotification> {
    @Override
    public void send(PushNotification notification) {
        System.out.println(notification.formattedMessage());
    }

    @Override
    public void send(List<PushNotification> notifications) {
        for (PushNotification notification : notifications) {
            System.out.println(notification.formattedMessage());
        }
    }
}
