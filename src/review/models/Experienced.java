package review.models;

import java.time.LocalDate;

public class Experienced extends Candidate{
    int yearsOfExp;
    String proSkill;

    public Experienced() {
    }

    public Experienced(String candidateId, String firstName, String lastName, LocalDate dayOfBirth,
                       String address, String phone, String email, int type, int yearsOfExp, String proSkill) {
        super(candidateId, firstName, lastName, dayOfBirth, address, phone, email, type);
        this.yearsOfExp = yearsOfExp;
        this.proSkill = proSkill;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience Candidate: " +
                "yearsOfExp: " + yearsOfExp +
                ", proSkill: '" + proSkill + '\'' +
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
