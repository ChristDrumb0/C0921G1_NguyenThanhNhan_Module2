package case_study.services.Impl;

import case_study.data.dataservice.Reader;
import case_study.data.dataservice.Writer;
import case_study.models.PCustomer;
import case_study.models.PEmployee;
import case_study.services.CustomerService;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    public static final String PATH_FILE = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\case_study\\data\\dataservice\\customer.csv";
    Scanner scanner = new Scanner(System.in);

    List<PCustomer> customers= Reader.getCustomer(PATH_FILE);
//    List<PCustomer> customers = new LinkedList<>();
//    {
//        customers.add(new PCustomer("CUS0005", "Nguyen Van A", LocalDate.of(1988, 3, 20), "Nam", "200293748", "0993736458", "anguyen@gmail.com",5,"VN"));
//        customers.add(new PCustomer("CUS0019", "Nguyen Van B", LocalDate.of(1990, 6, 21), "Nam", "207619384", "0962898977", "anguyen@gmail.com",5,"VN"));
//        customers.add(new PCustomer("CUS0003", "Nguyen Thi C", LocalDate.of(1992, 9, 22), "Nữ", "209150705", "0967218676", "anguyen@gmail.com",5,"VN"));
//    }

    @Override
    public void displayService() {
        SortCustomerById sortById = new SortCustomerById();
        Collections.sort(customers,sortById);
        for (PCustomer cus : customers) {
            System.out.println(cus);
        }
    }

    @Override
    public void addService(PCustomer customer) {
        boolean flag = true;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerId().equals(customer.getCustomerId())) {
                while (true) {
                    System.out.println("Đã có khách hàng, bạn có muốn cập nhập (Y/N)");
                    String yes = scanner.nextLine();
                    if (yes.equals("y") || yes.equals("Y")) {
                        customers.remove(i);
                        customers.add(customer);
                        Writer.writeCustomerToCSV(PATH_FILE,customers,false);
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
            customers.add(customer);
            Writer.writeCustomerToCSV(PATH_FILE,customers,true);
            System.out.println("Thêm mới thành công");
        }
    }

    @Override
    public boolean getCusID(String customerId) {
        for(int i = 0; i<customers.size();i++){
            if (customers.get(i).getCustomerId().equals(customerId)){
                return false;
            }
        }
        return true;
    }

    @Override
    public void editService(PCustomer customer) {
        for (PCustomer cus : customers) {
            if (cus.getCustomerId().equals(customer.getCustomerId())) {
                cus.setName(customer.getName());
                cus.setBirthDay(customer.getBirthDay());
                cus.setGender(customer.getGender());
                cus.setPersonalId(customer.getPersonalId());
                cus.setPhoneNumber(customer.getPhoneNumber());
                cus.setEmail(customer.getEmail());
                cus.setCustomerType(customer.getCustomerType());
                cus.setCustomerAddress(customer.getCustomerAddress());
            }
        }
        Writer.writeCustomerToCSV(PATH_FILE,customers,false);
    }

}
