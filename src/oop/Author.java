package oop;

import java.util.Objects;

public class Author  {
    private String firstName;
    private String lastName;
    private boolean isHeDeadAlready;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Author newAuthor(String firstName, String lastName){
        return new Author(firstName, lastName);
    }

    @Override
    public String toString() {
       String x = "Author name is: " + firstName + " " +lastName;
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return isHeDeadAlready == author.isHeDeadAlready &&
                Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, isHeDeadAlready);
    }
}
