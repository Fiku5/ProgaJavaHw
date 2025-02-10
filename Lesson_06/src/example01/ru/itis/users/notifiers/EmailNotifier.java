package example01.ru.itis.users.notifiers;

import example01.ru.itis.users.models.User;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class EmailNotifier implements Notifier {

    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Оповещение по Email на почту " + user.getEmail() + ", текст - " + message);
    }
}
