package ru.itis.users.controllers;

import ru.itis.users.services.UsersService;
import ru.itis.users.notifiers.AbstractNotifier;

import java.util.Scanner;

public class UsersController {

    private final Scanner scanner;

    private final UsersService service;

    public UsersController() {
        this.scanner = new Scanner(System.in);
        this.service = new UsersService();
    }

    public void run() {

        while (true) {
            printMainMenu();

            processCommandFromMainMenu();
        }
    }

    private void printMainMenu() {
        System.out.println("Добрый день!");
        System.out.println("Выберите необходимый пункт меню:");
        System.out.println("1. Добавить пользователя");
        System.out.println("2. Удалить пользователя");
        System.out.println("0. Выход");
    }

    private void processCommandFromMainMenu() {
        int command = scanner.nextInt();

        switch (command) {
            case 1 -> handleAddUser();
            case 2 -> handleDeleteUser();
            case 0 -> System.exit(0);
        }
    }

    private void handleAddUser() {
        System.out.println("Введите email пользователя: ");
        scanner.nextLine();
        String email = scanner.nextLine();
        System.out.println("Введите пароль пользователя: ");
        String password = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        String phone = scanner.nextLine();

        service.addUser(email, password, phone);
    }

    private void handleDeleteUser() {
        System.out.println("Введите email пользователя: ");
        scanner.nextLine();
        String email = scanner.nextLine();
        service.deleteUser(email);
    }


}
