package app.entities;

import java.util.Objects;

public class User {
    private String login;
    private String name;
    private String password;
    private static User admin = new User("admin", "admin", "admin");
// Rjvty
    public User(String login, String password, String name) {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public User (String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;
        if (!Objects.equals(login, user.login)) return false;
        return Objects.equals(password, user.password);
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static User getAdmin () {
        return admin;
    }
}
