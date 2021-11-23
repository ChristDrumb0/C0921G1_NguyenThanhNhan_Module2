package case_study.services;

import case_study.models.PEmployee;

public interface EmployeeService extends Service{
    void displayEmployee();
    void addEmployee(PEmployee employee);
    boolean getEmployID(String employeeId);
    void editEmployee(PEmployee employeeId);



}
