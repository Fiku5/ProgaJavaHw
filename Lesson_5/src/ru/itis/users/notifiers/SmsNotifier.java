package ru.itis.users.notifiers;

import ru.itis.users.models.User;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class SmsNotifier extends AbstractNotifier { // для смс оповещений

    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Оповещение по СМС на номер " + user.getPhone() + ", текст - " + message);
    }
}
