package films;

import java.util.ArrayList;
import java.util.List;

public class Actors  {
    private List<Actors> actorsList = new ArrayList<>();
private String firstName;
private String lastname;
private String birthDate;

    public Actors(String firstName, String lastName, String birthDate) {
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

    @Override
    public String toString() {
        String s = firstName + " " + lastname +" born : " + birthDate;
        return s;
    }
}
