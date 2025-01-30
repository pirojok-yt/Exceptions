package ru.skillbox.notification_sender;

import lombok.Setter;
import ru.skillbox.notification.SmsNotification;

import java.util.List;
@Setter
public class SmsNotificationSender implements NotificationSender<SmsNotification> {
    @Override
    public void send(SmsNotification notification) {
        System.out.println(notification.formattedMessage());
    }

    @Override
    public void send(List<SmsNotification> notifications) {
        for (SmsNotification notification : notifications) {
            System.out.println(notification.formattedMessage());
        }
    }
}
