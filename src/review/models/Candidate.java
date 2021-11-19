package review.models;

import java.time.LocalDate;
import java.util.Objects;

public class Candidate {
    String candidateId;
    String firstName;
    String lastName;
    LocalDate dayOfBirth;
    String address;
    String phone;
    String email;
    int type;

    public Candidate() {
    }

    public Candidate(String candidateId, String firstName, String lastName, LocalDate dayOfBirth,
                     String address, String phone, String email, int type) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public String candidateType(){
        switch (getType()){
            case 0:
                return "Experience";
            case 1:
                return "Fresher candidate";
            case 2:
                return "Intern candidate";
            default:
                return "";
        }
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "candidateId: '" + candidateId + '\'' +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", dayOfBirth: '" + dayOfBirth +'\'' +
                ", address: '" + address + '\'' +
                ", phone: '" + phone + '\'' +
                ", email: '" + email + '\'' +
                ", type: '" + type + '\'' +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return candidateId.equals(candidate.candidateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidateId);
    }
}
