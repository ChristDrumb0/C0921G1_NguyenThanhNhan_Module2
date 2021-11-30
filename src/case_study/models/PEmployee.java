package case_study.models;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class PEmployee extends Person{
    String employeeId;

    int studyLevel;
    int position;

    int salary;

    public PEmployee() {
    }


    public PEmployee(String employeeId, String name, LocalDate dayOfBirth, String gender, String personalId, String phoneNumber, String email, int studyLevel, int position, int salary) {
        super(name, dayOfBirth, gender, personalId, phoneNumber, email);
        this.employeeId = employeeId;
        this.studyLevel = studyLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeCode(String employeeId) {
        this.employeeId = employeeId;
    }

    public  int getLevel(){
        return studyLevel;
    }

    public String getStudyLevel() {
        switch (getLevel()){
            //    private String[] StudyLevel = {"Intermediate","College","University","Post Graduated"};
            case 1:
                return "Intermediate";
            case 2:
                return "College";
            case 3:
                return "University";
            case 4:
                return "Post Graduated";

            default:
                return "";
        }

    }

    public void setStudyLevel(int studyLevel) {
        this.studyLevel = studyLevel;
    }

    public int getPosi(){
        return position;
    }
    public String getPosition() {
        //    = {"Reception","Waiter", "Executive", "Supervisors", "Managers", "Directors"};
        switch (getPosi()){
            case 1:
                return "Reception";
            case 2:
                return "Waiter";
            case 3:
                return "Executive";
            case 4:
                return "Supervisors";
            case 5:
                return "Managers";
            case 6:
                return "Directors";

            default:
                return "";
        }
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employeeId: '" + employeeId + '\'' +
                ", name: '" + name + '\'' +
                ", dayOfBirth: " + dayOfBirth +
                ", gender: " + gender +
                ", personalId: '" + personalId + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", email: '" + email + '\'' +
                ", StudyLevel=" + getStudyLevel() +
                ", position=" + getPosition() +
                ", salary=" + salary +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PEmployee employee = (PEmployee) o;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}
