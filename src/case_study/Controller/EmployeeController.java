package case_study.controller;

import case_study.models.PEmployee;
import case_study.services.EmployeeService;
import case_study.services.Impl.EmployeeServiceImpl;


import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeController {
    EmployeeService employees= new EmployeeServiceImpl();
    Scanner sc = new Scanner(System.in);


    public void displayEmployee(){

        employees.displayService();
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
        String gender = sc.nextLine();
        System.out.println("Nhập CMND");
        String pId = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        String phone = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập học vị: 1.Intermediate 2.College 3.University 4.Post Graduated");
        int level = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí làm việc: 1.Reception 2.Waiter 3.Executive 4.Supervisors 5.Managers 6.Directors");
        int position = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mức lương");
        int salary = Integer.parseInt(sc.nextLine());
        employee = new PEmployee(id,name,dOB,gender,pId,phone,email,level,position,salary);
        employees.addService(employee);

    }
    public void editEmployee(){
        String id;
        while (true){
            System.out.println("Nhập id");
            id= sc.nextLine();
            if (!employees.getEmployID(id)){
                System.out.println("Đã tìm thấy, vui lóng sửa: ");
                break;
            }
            else{
                System.out.println("Không tìm thấy trên hệ thống");
            }

        }
        System.out.println("Nhập Tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        LocalDate dOB = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập CMND");
        String pId = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        String phone = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập học vị: 1.Intermediate 2.College 3.University 4.Post Graduated");
        int level = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí làm việc: 1.Reception 2.Waiter 3.Executive 4.Supervisors 5.Managers 6.Directors");
        int position = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mức lương");
        int salary = Integer.parseInt(sc.nextLine());
        PEmployee employee= new PEmployee(id,name,dOB,gender,pId,phone,email,level,position,salary);
        employees.editService(employee);
    }

}
