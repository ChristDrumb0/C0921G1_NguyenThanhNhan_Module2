package case_study.controller;

import case_study.models.PEmployee;
import case_study.services.EmployeeService;
import case_study.services.Impl.EmployeeServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeController {
    EmployeeService employees= new EmployeeServiceImpl();
    Scanner sc = new Scanner(System.in);
    public void displayEmployee(){
        employees.displayEmployee();
    }
    public void addEmployee(){
        PEmployee employee;
        System.out.println("Nhập id");
        String id= sc.nextLine();
        System.out.println("Nhập Tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        LocalDate dOB = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập giới tính");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập CMND");
        String pId = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        String phone = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập cấp bậc");
        int level = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí làm việc");
        int position = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mức lương");
        int salary = Integer.parseInt(sc.nextLine());
        employee = new PEmployee(id,name,dOB,gender,pId,phone,email,level,position,salary);
        employees.addEmployee(employee);
    }
    public void editEmployee(PEmployee employeeId){

    }

}
