package case_study.controller;

import case_study.models.Booking;
import case_study.services.EmployeeService;

import java.util.Scanner;

public class MainMenu {
    EmployeeController employee = new EmployeeController();
    CustomerController customer = new CustomerController();
    FacilityController facility = new FacilityController();
    BookingController booking = new BookingController();
    ContractController contract = new ContractController();
    public void menu() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 6) {
            System.out.print("Main menu\n"+
            "1. Employee Management\n"+
            "2. Customer Management\n"+
            "3. Facility Management \n"+
            "4. Booking Management\n"+
            "5. Promotion Management\n"+
            "6. Exit\n"+
            "Enter your choice: \n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    while (choice != 4) {
                        System.out.print("Employee Management menu \n"+
                        "1. Display list employees\n"+
                        "2. Add new employee\n"+
                        "3. Edit employee\n"+
                        "4. Return main menu\n"+
                        "Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                employee.displayEmployee();
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                employee.addEmployee();
//                                System.out.println("Đã thêm thành công");
                                employee.displayEmployee();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                employee.editEmployee();
                                System.out.println("Đã sửa thành công");
                                employee.displayEmployee();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 2:
                    while (choice != 4){
                        System.out.print("Customer Management menu\n"+
                        "1. Display list customers\n"+
                        "2. Add new customer\n"+
                        "3. Edit customer\n"+
                        "4. Return main menu\n"+
                        "Enter your choice: \n");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                customer.displayCustomer();
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                customer.addCustomer();
                                customer.displayCustomer();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                customer.editCustomer();
                                System.out.println("Đã sửa thành công");
                                customer.displayCustomer();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 3:
                    while (choice != 4){
                        System.out.print("Facility Management menu\n"+
                        "1. Display list facility\n"+
                        "2. Add new facility\n"+
                        "3. Display list facility maintenance\n"+
                        "4. Return main menu\n"+
                        "Enter your choice: \n");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                facility.displayFacility();
                                System.out.println("***********************");
                                break;
                            case 2:
                                int choose = 0;
                                while (choose!= 4){
                                    System.out.print("************Add Facility***********\n"+
                                            "1. Add new Room\n"+
                                            "2. Add new Villa\n"+
                                            "3. Add new House\n"+
                                            "4. Return\n");
                                   choose = input.nextInt();
                                   switch (choose){
                                       case 1:
                                           facility.addRoom();
                                           System.out.println("Đã thêm thành công");
                                           break;
                                       case 2:
                                           facility.addVilla();
                                           System.out.println("Đã thêm thành công");
                                           break;
                                       case 3:
                                           facility.addHouse();
                                           System.out.println("Đã thêm thành công");
                                           break;
                                   }

                                }
                                facility.displayFacility();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                facility.maintenaceDisplay();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");

                                break;

                        }
                    }
                    break;
                case 4:
                    while (choice != 6){
                        System.out.print("Booking Management menu\n"+
                        "1. Add new booking\n"+
                        "2. Display list booking\n"+
                        "3. Create new contracts\n"+
                        "4. Display list contracts\n"+
                        "5. Edit contracts\n"+
                        "6. Return main menu\n"+
                        "Enter your choice: \n");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                booking.addBooking();

                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                booking.displayBooking();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                contract.addContract();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                contract.displayContract();
                                System.out.println("***********************");
                                break;
                            case 5:
                                System.out.println("***********************");
                                contract.editContract();
                                System.out.println("***********************");
                                break;
                            case 6:
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }

                    }
                    choice = 0;
                    break;


                case 5:
                    while (choice != 6){
                        System.out.print("Promotion Management menu\n"+
                        "1. Display list customers use service\n"+
                        "2. Display list customers get voucher\n"+
                        "3. Return main menu\n"+
                        "Enter your choice: \n");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Display list customers use service");
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Display list customers get voucher");
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("not a choice");

            }
        }
    }
}
