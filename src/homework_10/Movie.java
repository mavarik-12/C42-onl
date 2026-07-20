package homework_10;

import java.util.Objects;
class User {
    private final String username;
    private final String email;
    private final int age;
    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(username, user.username) &&
                Objects.equals(email, user.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(username, email, age);
    }
}
