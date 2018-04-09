package oop;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String email;


    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public String getLastName() {
        return lastName.toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void createNewUser(String name, String lastName, String email){
        User user = new User(name, lastName, email);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "Users firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", email = '" + email;
    }
}
