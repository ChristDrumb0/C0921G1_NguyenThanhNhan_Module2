package case_study.controller;

import case_study.models.PEmployee;
import case_study.services.EmployeeService;
import case_study.services.Impl.EmployeeServiceImpl;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();
    public void displayEmployee(){
        employeeService.displayEmployee();
    }
    public void editEmployee(PEmployee employeeId){

    }

}
