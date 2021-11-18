package case_study.services;

import case_study.models.PEmployee;

public interface EmployeeService extends Service{
    void displayEmployee();
    void addEmployee(PEmployee employee);
    void getEmployID(PEmployee employeeId);
    void editEmployee(PEmployee employeeId);



}
