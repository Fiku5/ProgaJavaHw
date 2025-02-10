package ru.itis.users.notifiers;

import ru.itis.users.models.User;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class WhatsappNotifier extends AbstractNotifier {
    @Override
    public void notifyUser(User user, String message) {
        System.out.println("Оповещение через Whatsapp на номер -" + user.getPhone() + " текст " + message);
    }
}
