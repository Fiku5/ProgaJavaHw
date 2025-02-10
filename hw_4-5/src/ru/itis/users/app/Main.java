package ru.itis.users.app;

import ru.itis.users.controllers.UsersController;
import ru.itis.users.notifiers.CallNotifier;
import ru.itis.users.notifiers.EmailNotifier;
import ru.itis.users.notifiers.SmsNotifier;

public class Main {
    public static void main(String[] args) {
        SmsNotifier smsNotifier = new SmsNotifier();
        CallNotifier callNotifier = new CallNotifier();
        EmailNotifier emailNotifier = new EmailNotifier();
        UsersController usersController = new UsersController();
        usersController.run();
    }
}
