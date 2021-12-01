package case_study.controller;

import case_study.models.PCustomer;
import case_study.services.CustomerService;
import case_study.services.Impl.CustomerServiceImpl;
import case_study.utils.validation.ValidationRegex;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomerController {
    CustomerService customers = new CustomerServiceImpl();
    Scanner sc = new Scanner(System.in);
    ValidationRegex valid = new ValidationRegex();

    public void displayCustomer() {
        customers.displayService();
    }

    public void addCustomer(){
        ValidationRegex valid = new ValidationRegex();
        String id = valid.checkIdCus();

        System.out.println("Nhập Tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String dOB = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập CMND");
        String pId = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        String phone = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập loại KH: 1.Diamond 2.Platinum 3.Gold 4.Silver 5.Member");
        int type = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Quốc Gia");
        String address = sc.nextLine();
        PCustomer customer = new PCustomer(id,name,dOB,gender,pId,phone,email,type,address);
        customers.addService(customer);
    }
    public void editCustomer(){
        String id;
        while (true){
            System.out.println("Nhập id");
            id= sc.nextLine();
            if (!customers.getCusID(id)){
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
        String dOB = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập CMND");
        String pId = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        String phone = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập loại KH: 1.Diamond 2.Platinum 3.Gold 4.Silver 5.Member");
        int type = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Quốc Gia");
        String address = sc.nextLine();
        PCustomer customer = new PCustomer(id,name,dOB,gender,pId,phone,email,type,address);
        customers.editService(customer);

    }


}
