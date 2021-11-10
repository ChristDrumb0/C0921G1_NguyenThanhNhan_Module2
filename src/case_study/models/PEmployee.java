package case_study.models;

public class PEmployee extends Person{
    private String employeeId;
    private String[] StudyLevel = {"Intermediate","College","University","Post Graduated"};
    private String[] position = {"Reception","Waiter", "Executive", "Supervisors", "Managers", "Directors"};
    private int salary;

    public PEmployee() {
    }

    public PEmployee(String employeeId, String[] studyLevel, String[] position, int salary) {
        this.employeeId = employeeId;
        StudyLevel = studyLevel;
        this.position = position;
        this.salary = salary;
    }

    public PEmployee(String name, String birthDay, boolean gender, String idNumber, long phoneNumber, String email, String employeeId, String[] studyLevel, String[] position, int salary) {
        super(name, birthDay, gender, idNumber, phoneNumber, email);
        this.employeeId = employeeId;
        StudyLevel = studyLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeId;
    }

    public void setEmployeeCode(String employeeId) {
        this.employeeId = employeeId;
    }

    public String[] getStudyLevel() {
        return StudyLevel;
    }

    public void setStudyLevel(String[] studyLevel) {
        StudyLevel = studyLevel;
    }

    public String[] getPosition() {
        return position;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
