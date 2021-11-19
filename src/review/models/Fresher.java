package review.models;

import java.time.LocalDate;

public class Fresher extends Candidate{
    LocalDate graduate;
    int rank;
    String school;

    public Fresher() {
    }

    public Fresher(String candidateId, String firstName, String lastName, LocalDate dayOfBirth,
                   String address, String phone, String email, int type, LocalDate graduate, int rank, String school) {
        super(candidateId, firstName, lastName, dayOfBirth, address, phone, email, type);
        this.graduate = graduate;
        this.rank = rank;
        this.school = school;
    }

    public LocalDate getGraduate() {
        return graduate;
    }

    public void setGraduate(LocalDate graduate) {
        this.graduate = graduate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Fresher Candidate{" +
                "graduate: " + graduate +
                ", rank: " + rank +
                ", Graduate at: '" + school + '\'' +
                ", candidateId: '" + candidateId + '\'' +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", dayOfBirth: '" + dayOfBirth +'\'' +
                ", address: '" + address + '\'' +
                ", phone: '" + phone + '\'' +
                ", email: '" + email + '\'' +
                ", type: '" + type + '\'' +
                '.';
    }
}
