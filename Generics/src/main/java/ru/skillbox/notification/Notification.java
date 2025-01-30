package ru.skillbox.notification;

/**
 * Уведомления для пользователей
 */
public interface Notification {
    String subjectOrTitle = "Успешная регистрация!";
    String formattedMessage();
}
