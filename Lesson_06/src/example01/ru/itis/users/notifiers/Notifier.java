package example01.ru.itis.users.notifiers;

import example01.ru.itis.users.models.User;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public interface Notifier {
    void notifyUser(User user, String message);
}
