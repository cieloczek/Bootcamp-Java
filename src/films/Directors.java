package films;

public class Directors {
    private String firstName;
    private String lastname;
    private String birthDate;

    public Directors(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastname = lastName;
        this.birthDate=birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
