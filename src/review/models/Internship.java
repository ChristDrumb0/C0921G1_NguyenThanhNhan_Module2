package review.models;

import java.time.LocalDate;

public class Internship extends Candidate{
    String major;
    String semester;
    String schooling;

    public Internship() {

    }

    public Internship(String candidateId, String firstName, String lastName, int dayOfBirth,
                      String address, String phone, String email, int type, String major, String semester, String schooling) {
        super(candidateId, firstName, lastName, dayOfBirth, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.schooling = schooling;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSchooling() {
        return schooling;
    }

    public void setSchooling(String schooling) {
        this.schooling = schooling;
    }

    @Override
    public String toString() {
        return "Candidate: " +
                "Id: '" + candidateId + '\'' +
                ", name: '" + firstName +" "+ lastName + '\'' +
                ", dayOfBirth: '" + dayOfBirth +'\'' +
                ", address: '" + address + '\'' +
                ", phone: '" + phone + '\'' +
                ", email: '" + email + '\'' +
                ", type: '" + candidateType() + '\'' +
                ", major: '" + major + '\'' +
                ", semester: '" + semester + '\'' +
                ", University:'" + schooling + '\'' +
                '.';
    }
}
