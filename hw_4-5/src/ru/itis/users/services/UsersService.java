package ru.itis.users.services;

import ru.itis.users.models.User;
import ru.itis.users.repositories.UsersRepository;
import java.util.UUID;

public class UsersService {

    private final UsersRepository repository;

    public UsersService() {
        this.repository = new UsersRepository();
    }

    public void addUser(String email, String password,String phone) {
        User user = new User(UUID.randomUUID().toString(), email, password, phone);

        repository.save(user);
    }
    public void deleteUser(String email) {

        repository.dell(email);
    }
}
