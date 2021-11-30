package case_study.services;

import case_study.models.PEmployee;

import java.util.Comparator;

public interface EmployeeService extends Service<PEmployee>
//        , Comparator<PEmployee>
{
//    void displayEmployee();
//    void addEmployee(PEmployee employee);
    boolean getEmployID(String employeeId);
//    void editEmployee(PEmployee employeeId);

}
