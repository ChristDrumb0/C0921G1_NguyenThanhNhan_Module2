package case_study.services.Impl;

import case_study.models.PEmployee;
import case_study.services.EmployeeService;

import java.time.LocalDate;
import java.util.ArrayList;


public class EmployeeServiceImpl implements EmployeeService {
    ArrayList<PEmployee> employees = new ArrayList<>();
    {
        employees.add(new PEmployee("GM001","Nguyen Van A", LocalDate.of(1980,01,20),true,"200293748","0211456789","anguyen@gmail.com",4,6,5000));
        employees.add(new PEmployee("FB001","Nguyen Van B", LocalDate.of(1996,02,21),true,"203457420","0911456787","bnguyen@gmail.com",4,5,1500));
        employees.add(new PEmployee("Sl001","Nguyen Thi C", LocalDate.of(1997,03,22),false,"208064821","0811456788","cnguyen@gmail.com",4,5,1000));
    }


    @Override
    public void displayEmployee() {
        for (PEmployee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee(PEmployee employee){
        employees.add(employee);
    }
    
    @Override
    public boolean getEmployID(String employeeId) {
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getEmployeeId().equals(employeeId)){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }

    @Override
    public void editEmployee(PEmployee employee) {
        for (PEmployee emp : employees) {
            if (emp.getEmployeeId().equals(employee.getEmployeeId())){
                emp.setName(employee.getName());
                emp.setBirthDay(employee.getBirthDay());
                emp.setGender(employee.isMale());
                emp.setPersonalId(employee.getPersonalId());
                emp.setPhoneNumber(employee.getPhoneNumber());
                emp.setEmail(employee.getEmail());
                emp.setStudyLevel(employee.getLevel());
                emp.setPosition(employee.getPosi());
                emp.setSalary(employee.getSalary());
            }
        }
    }

    @Override
    public void findByAll() {

    }
}
