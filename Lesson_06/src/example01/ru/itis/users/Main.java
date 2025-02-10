package example01.ru.itis.users;

import example01.ru.itis.users.notifiers.CallNotifier;
import example01.ru.itis.users.notifiers.EmailNotifier;
import example01.ru.itis.users.notifiers.SmsNotifier;
import example01.ru.itis.users.notifiers.WhatsappNotifier;
import example01.ru.itis.users.services.UsersService;
import ru.itis.users.notifiers.*;

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
