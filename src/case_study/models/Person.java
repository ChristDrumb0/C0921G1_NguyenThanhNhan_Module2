package case_study.models;
import java.time.LocalDate;
public abstract class Person {
    String name;
    LocalDate dayOfBirth;
    boolean gender;
    String personalId;
    String phoneNumber;
    String email;

    public Person() {
    }

    public Person(String name, LocalDate dayOfBirth, boolean gender, String personalId, String phoneNumber, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.personalId = personalId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return dayOfBirth;
    }

    public void setBirthDay(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public boolean isMale() {
        return gender;
    }

    public String getGender(){
        if (!isMale()) {
            return "Female";
        }
        return "Male";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name: '" + name + '\'' +
                ", dayOfBirth: " + dayOfBirth +
                ", gender: " + getGender() +
                ", personalId: '" + personalId + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", email: '" + email + '\'' +
                '.';
    }
}
