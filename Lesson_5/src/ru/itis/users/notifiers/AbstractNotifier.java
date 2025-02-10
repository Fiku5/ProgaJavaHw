package ru.itis.users.notifiers;

import ru.itis.users.models.User;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public abstract class AbstractNotifier {
    public abstract void notifyUser(User user, String message);
}
