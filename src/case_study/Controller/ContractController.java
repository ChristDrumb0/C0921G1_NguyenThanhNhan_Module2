package case_study.controller;

import case_study.utils.Writer;
import case_study.models.Contract;
import case_study.services.BookingService;
import case_study.services.ContractService;
import case_study.services.Impl.BookingServiceImpl;
import case_study.services.Impl.ContractServiceImpl;
import static case_study.services.Impl.BookingServiceImpl.BOOKING_QUEUE_PATH;
import java.util.Scanner;

public class ContractController {
    Scanner sc = new Scanner(System.in);
    BookingService bookingsS = new BookingServiceImpl();
    ContractService contractS = new ContractServiceImpl();

    public void addContract() {
        String contractId = null;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập số hợp đồng");
                contractId = sc.nextLine();
                flag = false;
                for (Contract contract : contractS.getContractSet()) {
                    if (contract.getContractNumber().equals(contractId)) {
                        System.out.println("Hợp đồng đã tồn tại, vui lòng nhập lại !");
                        flag = true;
                        break;
                    }
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }

        }
        int deposit = 0;
        int payment = 0;
        try {
            System.out.println("Nhập số tiền cọc");
            deposit = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tổng chi phí");
            payment = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String bookingId = contractS.getQueueBooking().peek().getBookingId();
        System.out.println(bookingId);
        String customerId = contractS.getQueueBooking().poll().getCustomer();
        System.out.println(customerId);
//        contractS.getQueueBooking().remove();
        Writer.writeBookingQueue(BOOKING_QUEUE_PATH,contractS.getQueueBooking(),false);
        Contract contract = new Contract(contractId, deposit, payment, bookingId, customerId);
        contractS.addService(contract);

    }

    public void displayContract() {
        contractS.displayService();
    }

    public void editContract() {
        boolean flag = true;
        while (flag) {
            System.out.println("Nhập số hợp đồng cần sửa");
            String contractId = sc.nextLine();
            flag = false;
            for (Contract contract : contractS.getContractSet()) {
                if (contract.getContractNumber().equals(contractId)) {

                    System.out.println("---Sửa hợp đồng---\n"
                            + "1. Edit number of Contract \n"
                            + "2. Edit booking code of Contract \n"
                            + "3. Edit deposit of Contract \n"
                            + "4. Edit payments  of Contract \n"
                            + "5. Edit customer code of booking \n"
                            + "0. Return\n"
                            + "Enter your choice: ");
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            System.out.println("Nhập số hợp đông");
                            String numberOfContract = sc.nextLine();
                            contract.setContractNumber(numberOfContract);
                            break;
                        case "2":
                            String bookingCode = "";
                            try {
                                System.out.println("Nhập mã Booking ");
                                bookingCode = sc.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            contract.setBookingId(bookingCode);
                            break;
                        case "3":
                            int deposit = 0;
                            try {
                                System.out.println("Nhập tiền cọc");
                                deposit = Integer.parseInt(sc.nextLine());
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            contract.setDeposit(deposit);
                            break;
                        case "4":
                            int payments = 0;
                            try {
                                System.out.println("Nhập tổng tiền thanh toán");
                                payments = Integer.parseInt(sc.nextLine());
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            contract.setTotalPayment(payments);
                            break;
                        case "5":
                            String customerCode = "";
                            try {
                                System.out.println("Nhập ID khách hàng");
                                customerCode = sc.nextLine();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            contract.setCustomerId(customerCode);
                            break;
                        case "0":
                            break;
                        default:
                            throw new IllegalStateException("Nhập chưa đúng: " + choice);
                    }
                    Contract cIe = new Contract();
                    contractS.editService(cIe);
                    break;
                }
                else{
                    System.out.println("Hợp đồng chưa tồn tại, vui lòng thử lại !");
                    flag = true;
                }
            }

        }
    }


}
