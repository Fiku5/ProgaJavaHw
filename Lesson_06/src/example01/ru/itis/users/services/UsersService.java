package example01.ru.itis.users.services;

import example01.ru.itis.users.models.User;
import example01.ru.itis.users.notifiers.Notifier;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersService {

    private final Notifier notifier;

    public UsersService(Notifier notifier) {
        this.notifier = notifier;
    }
    public void addUser(String email, String phone, String password) {

        User user = new User(phone, email, password);
        // TODO: сохранение пользователя

        notifier.notifyUser(user, "Ваш аккаунт был создан");
    }
}
