package ru.itis.users.services;

import ru.itis.users.models.User;
import ru.itis.users.notifiers.AbstractNotifier;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersService {

    private final AbstractNotifier notifier;

    public UsersService(AbstractNotifier notifier) {
        this.notifier = notifier;
    }
    public void addUser(String email, String phone, String password) {

        User user = new User(phone, email, password);
        // TODO: сохранение пользователя

        notifier.notifyUser(user, "Ваш аккаунт был создан");
    }
}
