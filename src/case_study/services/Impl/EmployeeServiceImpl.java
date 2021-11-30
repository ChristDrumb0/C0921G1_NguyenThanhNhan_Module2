package case_study.services.Impl;

import case_study.models.PEmployee;
import case_study.services.EmployeeService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<PEmployee> employees = new ArrayList<>();

    {
        employees.add(new PEmployee("GM002", "Nguyen Van A", LocalDate.of(1980, 01, 20), "Nam", "200293748", "0211456789", "anguyen@gmail.com", 4, 6, 5000));
        employees.add(new PEmployee("GM001", "Nguyen Van B", LocalDate.of(1996, 02, 21), "Nam", "203457420", "0911456787", "bnguyen@gmail.com", 4, 5, 1500));
        employees.add(new PEmployee("AL001", "Nguyen Thi C", LocalDate.of(1997, 03, 22), "Nữ", "208064821", "0811456788", "cnguyen@gmail.com", 4, 5, 1000));
    }


    @Override
    public void displayService() {
        SortEmployeeById sortById = new SortEmployeeById();
        Collections.sort(employees,sortById);
        for (PEmployee em : employees) {
            System.out.println(em);
        }
    }

    @Override
    public void addService(PEmployee employee) {
        boolean flag = true;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId().equals(employee.getEmployeeId())) {
                while (true) {
                    System.out.println("Đã có nhân viên, bạn có muốn cập nhập (Y/N)");
                    String yes = scanner.nextLine();
                    if (yes.equals("y") || yes.equals("Y")) {
                        employees.remove(i);
                        employees.add(employee);
                        System.out.println("Đã cập nhập");
                        flag = false;
                        break;
                    } else if (yes.equals("n") || yes.equals("N")) {
                        flag = false;
                        break;
                    }
                }break;

            }
        }
        if (flag) {
            employees.add(employee);
            System.out.println("Thêm mới thành công");
        }
    }

    @Override
    public boolean getEmployID(String employeeId) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId().equals(employeeId)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void editService(PEmployee employee) {
        for (PEmployee emp : employees) {
            if (emp.getEmployeeId().equals(employee.getEmployeeId())) {
                emp.setName(employee.getName());
                emp.setBirthDay(employee.getBirthDay());
                emp.setGender(employee.getGender());
                emp.setPersonalId(employee.getPersonalId());
                emp.setPhoneNumber(employee.getPhoneNumber());
                emp.setEmail(employee.getEmail());
                emp.setStudyLevel(employee.getLevel());
                emp.setPosition(employee.getPosi());
                emp.setSalary(employee.getSalary());
            }
        }
    }


//    @Override
//    public int compare(PEmployee o1, PEmployee o2) {
//        return o1.getEmployeeId().compareTo(o2.getEmployeeId());
//    }
}
