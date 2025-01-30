package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;
import ru.skillbox.notification_sender.PushNotificationSender;
import ru.skillbox.notification_sender.SmsNotificationSender;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TODO: написать работу с уведомлениями и удалить эту строку
        EmailNotificationSender eSender = new EmailNotificationSender();
        eSender.send(Arrays.asList(new EmailNotification(Arrays.asList("петя", "вася"), "крутой"), new EmailNotification(Arrays.asList("ка", "кира"), "крутой")));

        eSender.send(new EmailNotification(Arrays.asList("петя", "вася"), "крутой"));

        SmsNotificationSender sSender = new SmsNotificationSender();
        sSender.send(Arrays.asList(new SmsNotification(Arrays.asList("петя", "вася"), "крутой"), new SmsNotification(Arrays.asList("ка", "кира"), "крутой")));

        sSender.send(new SmsNotification(Arrays.asList("петя", "вася"), "крутой"));

        PushNotificationSender pSender = new PushNotificationSender();
        pSender.send(Arrays.asList(new PushNotification(Arrays.asList("петя", "вася"), "крутой"), new PushNotification(Arrays.asList("ка", "кира"), "крутой")));

        pSender.send(new PushNotification(Arrays.asList("ка", "кира"), "крутой"));

    }
}
