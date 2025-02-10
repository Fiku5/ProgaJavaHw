package ru.itis.users.notifiers;

import ru.itis.users.models.User;

public class SmsNotifier extends AbstractNotifier {

    @Override
    public void notifyUser(User user, String message) {
        System.out.println("СМС-оповещение по cмс " + user.getPhone() + " Текст: " + message);
    }
}
