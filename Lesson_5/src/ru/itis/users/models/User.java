package ru.itis.users.models;

/**
 * Lesson_5
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class User {

    private final String phone;
    private final String email;
    private final String password;

    public User(String phone, String email, String password) {
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
