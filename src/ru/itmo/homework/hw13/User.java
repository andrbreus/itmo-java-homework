package ru.itmo.homework.hw13;

public class User<T> {
    private T id;
    private String login;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
