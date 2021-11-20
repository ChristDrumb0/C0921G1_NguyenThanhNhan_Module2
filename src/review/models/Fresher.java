package review.models;

import java.time.LocalDate;

public class Fresher extends Candidate{
    int graduateDate;
    int rank;
    String school;

    public Fresher() {
    }

    public Fresher(String candidateId, String firstName, String lastName, int dayOfBirth,
                   String address, String phone, String email, int type, int graduateDate, int rank, String school) {
        super(candidateId, firstName, lastName, dayOfBirth, address, phone, email, type);
        this.graduateDate = graduateDate;
        this.rank = rank;
        this.school = school;
    }

    public int getGraduate() {
        return graduateDate;
    }

    public void setGraduate(int graduateDate) {
        this.graduateDate = graduateDate;
    }

    public int getRank() {
        return rank;
    }

    private String toRank(){
        switch (getRank()){
            case 1:
                return "Excellence";
            case 2:
                return "Good";
            case 3:
                return "Fair";
            case 4:
                return "Poor";
            default:
                return "";
        }
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
        return "Candidate: " +
                "Id: '" + candidateId + '\'' +
                ", name: '" + firstName +" "+ lastName + '\'' +
                ", dayOfBirth: '" + dayOfBirth +'\'' +
                ", address: '" + address + '\'' +
                ", phone: '" + phone + '\'' +
                ", email: '" + email + '\'' +
                ", type: '" + candidateType() + '\'' +
                ", year of graduate: " + graduateDate +
                ", rank: " + toRank() +
                ", Graduate at: '" + school + '\'' +
                '.';
    }
}
