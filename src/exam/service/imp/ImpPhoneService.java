package exam.service.imp;

import case_study.utils.validation.ValidationRegex;
import exam.module.ImportPhone;
import exam.module.LegitPhone;
import exam.module.Phone;
import exam.service.Service;
import exam.util.ReaderFile;
import exam.util.ValidationExam;
import exam.util.WriterFile;


import java.util.List;
import java.util.Scanner;


public class ImpPhoneService implements Service {
    public static final String PHONE_FILE_PATH = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\exam\\data\\data.csv";

    Scanner sc = new Scanner(System.in);
    List<Phone> phoneList = ReaderFile.getPhone(PHONE_FILE_PATH);

    @Override
    public void addService() {
        int choose = 0;
        while (choose != 3) {
            System.out.println("Enter phone type \n" +
                    "1. Legit phone \n" +
                    "2. import phone\n" +
                    "3. Return \n" +
                    " Enter your choice ");
            choose = Integer.parseInt(sc.nextLine());
            int id = 1;
            String phoneName = "";
            String price = "";
            int quantity = 0;
            String manufacturer = "";
            switch (choose) {
                case 1:
                    String type = "legit phone";
                    String gTime = "";
                    String gArea = "";

                    for (int i = 0; i < phoneList.size(); i++) {
                        int max = phoneList.get(i).getId();
                        if (phoneList.get(i).getId() > max){
                            max = phoneList.get(i).getId();
                            id = (max + 1);
                        }

                    }


                    try {
                        System.out.println("Enter phone name");
                        phoneName = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter phone price");
                        price = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    while(true){
                        try {
                            System.out.println("Enter phone quantity in stock");
                            quantity = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Not a number");;
                        }
                    }

                    try {
                        System.out.println("Enter phone's manufacturer");
                        manufacturer = ValidationExam.checkName();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter phone guarantee time");
                        gTime = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter phone guarantee area");
                        gArea = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Phone phone1 = new LegitPhone(type, id, phoneName, price, quantity, manufacturer, gTime, gArea);
                    phoneList.add(phone1);
                    WriterFile.writePhoneToCSV(PHONE_FILE_PATH, phoneList, false);
                    break;
                case 2:
                    String type2 = "import phone";
                    for (int i = 0; i < phoneList.size(); i++) {
                        int max = phoneList.get(i).getId();
                        if (phoneList.get(i) == null) {
                            id = 1;
                            break;
                        } else {
                            if (phoneList.get(i).getId() > max)
                                max = phoneList.get(i).getId();
                            id = (max + 1);
                        }
                    }
                    String country = "";
                    String status = "";
                    try {
                        System.out.println("Enter phone name");
                        phoneName = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter phone price");
                        price = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    while(true){
                        try {
                            System.out.println("Enter phone quantity in stock");
                            quantity = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Not a number");;
                        }
                    }
                    try {
                        System.out.println("Enter phone's manufacturer");
                        manufacturer = ValidationExam.checkName();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter phone import from");
                        country = ValidationExam.checkName();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter phone status");
                        status = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Phone phone = new ImportPhone(type2, id, phoneName, price, quantity, manufacturer, country, status);
                    phoneList.add(phone);
                    WriterFile.writePhoneToCSV(PHONE_FILE_PATH, phoneList, false);

                    break;
                case 3:
                    System.out.println("-=Return to main menu=-");
                    break;
                default:
                    System.err.println("Not a choice");
            }


        }

    }

    @Override
    public void deleteService() {
        while (true) {
            try {
                boolean flag = true;
                while (flag) {
                    System.out.println("Enter the phone id");
                    int accountId = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < phoneList.size(); i++) {
                        if (accountId == phoneList.get(i).getId()) {
                            System.out.println("Phone had been found");
                            System.out.println(phoneList.get(i).getId());
                            flag = false;
                            System.out.println("Do you want to delete the account (Y/N)");
                            String yN = sc.nextLine();
                            if (yN.toLowerCase().equals("y")) {
                                phoneList.remove(i);
                                System.out.println("Successfully delete");
                            } else if (yN.toLowerCase().equals("n")) {
                                System.out.println("Not yet delete");
                            } else {
                                System.out.println("Please choose Y or N");
                            }
                        }
                    }
                    if (flag) {
                        System.out.println("Phone didn't exist");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }

        }
    }

    @Override
    public void displayService() {
        for (Phone phone : phoneList) {
            System.out.println(phone);
        }
    }


    @Override
    public void searchService() {
        while (true) {
            try {
                boolean flag = true;
                while (flag) {
                    System.out.println("Enter the phone id");
                    int accountId = Integer.parseInt(sc.nextLine());

                    for (Phone phone : phoneList) {
                        if (accountId == phone.getId()) {
                            System.out.println("Phone had been found");
                            System.out.println(phone);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Phone didn't exist");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }

        }
    }

}
