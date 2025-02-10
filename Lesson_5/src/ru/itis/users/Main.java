package ru.itis.users;

import ru.itis.users.notifiers.*;
import ru.itis.users.services.UsersService;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        CallNotifier callNotifier = new CallNotifier();
        SmsNotifier smsNotifier = new SmsNotifier();
        EmailNotifier emailNotifier = new EmailNotifier();
        WhatsappNotifier whatsappNotifier = new WhatsappNotifier();
//        Notifier notifier = new Notifier();
        UsersService usersService = new UsersService(whatsappNotifier);
        usersService.addUser("sidikov@gmail.com", "+7999", "qwerty007");
    }
}
