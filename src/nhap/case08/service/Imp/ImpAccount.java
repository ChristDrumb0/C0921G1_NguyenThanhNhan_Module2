package nhap.case08.service.Imp;


import nhap.case08.model.BankAccount;
import nhap.case08.model.PaymentAccount;
import nhap.case08.model.SavingAccount;
import nhap.case08.service.Services;
import nhap.case08.util.ReadFileCSV;
import nhap.case08.util.SortById;
import nhap.case08.util.WriteFileCSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ImpAccount implements Services {

    public static final String FILE_PATH = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\nhap\\case08\\data\\account.csv";
    Scanner sc = new Scanner(System.in);

    List<BankAccount> saList = ReadFileCSV.getBankAccount(FILE_PATH);
//    List< BankAccount> saList = new ArrayList<>();
//    {
//        saList.add(new PaymentAccount(2,"003456783","Nguyen Van B","04/05/2020","9704230370093591","5000000"));
//        saList.add(new SavingAccount(1,"003456781","Nguyen Van A","04/05/2020",15000000,"05/05/2020","5","6"));
//
//    }

    @Override
    public void addService() {
        int choose = 0;
        while (choose != 3){
            System.out.println("Enter Account type \n" +
                    "1. Saving Account \n"+
                    "2. Paymenet Account \n"+
                    "3. Return \n"+
                    " Enter your choice ");
            choose = Integer.parseInt(sc.nextLine());
            int accountId =0;
            String accountNum="";
            String accountName="";
            String dateCreate="";
            switch (choose){
                case 1:
                    boolean flag = true;

                    int savingAmount= 0;
                    String savingDate="";
                    String interest="";
                    String period="";
                    while(flag){

                        try {
                            System.out.println("Enter new Saving Account Id");
                            accountId = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        flag = false;
                        for (BankAccount sAccount : saList) {
                            if (sAccount.getAccountId()== accountId) {
                                System.err.println("Employee code is exist, please enter again !");
                                flag = true;
                                break;
                            }
                        }
                    }
                    try {
                        System.out.println("Enter account number");
                    accountNum = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account name");
                        accountName = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account create date");
                    dateCreate = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account saving amount");
                    savingAmount = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account saving date");
                    savingDate = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account interest");
                    interest = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account saving period");
                    period = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    BankAccount accounts = new SavingAccount(accountId,accountNum,accountName,dateCreate,savingAmount,savingDate,interest,period);
                    saList.add(accounts);
                    WriteFileCSV.writeAccountToCSV(FILE_PATH,saList, false);
                    break;
                case 2:
                    boolean flag2 = true;
//                    int accountId =0;
//                    String accountNum="";
//                    String accountName="";
//                    String dateCreate="";
                    String cardNum="";
                    String moneyAmount="";
                    while(flag2){

                        try {
                            System.out.println("Enter new Payment Account Id");
                            accountId = Integer.parseInt(sc.nextLine());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        flag2 = false;
                        for (BankAccount pAccount : saList) {
                            if (pAccount.getAccountId()== accountId) {
                                System.err.println("Account already existed, please enter again !");
                                flag2 = true;
                                break;
                            }
                        }
                    }
                    try {
                        System.out.println("Enter account number");
                        accountNum = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account name");
                        accountName = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account create date");
                        dateCreate = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account card number");
                        cardNum = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println("Enter account's money amount");
                        moneyAmount = sc.nextLine();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    BankAccount accountp = new PaymentAccount(accountId,accountNum,accountName,dateCreate,cardNum,moneyAmount);
                    saList.add(accountp);
                    WriteFileCSV.writeAccountToCSV(FILE_PATH,saList, false);
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
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the account id");
            int accountId = Integer.parseInt(sc.nextLine());

            for (int i =0; i <saList.size();i++) {
                if (accountId == saList.get(i).getAccountId()) {
                    System.out.println("Account had been found");
                    System.out.println(saList.get(i));
                    flag = false;

                    System.out.println("Do you want to delete the account (Y/N)");
                    String yN = sc.nextLine();
//                    if(yN.equals("y")|| yN.equals("Y")){
                    if(yN.toLowerCase().equals("y")) {
                        saList.remove(i);
                        System.out.println("Successfully delete");
//                    }else if (yN.equals("n")|| yN.equals("N")){
                    } else if(yN.toLowerCase().equals("n")){
                        System.out.println("Not yet delete");
                    }else{
                        System.out.println("Please choose Y or N");
                    }
                }
            }
            if (flag) {
                System.err.println("Account didn't exist");
            }
        }
        if(!flag){

        }


    }


    @Override
    public void searchService() {
        while (true) {
            try {
                boolean flag = true;
                while (flag) {
                    System.out.println("Enter the account id");
                    int accountId = Integer.parseInt(sc.nextLine());

                    for (BankAccount ba : saList) {
                        if (accountId == ba.getAccountId()) {
                            System.out.println("Account had been found");
                            System.out.println(ba);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Account didn't exist");
                    }
                }break;
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }

        }
    }

    @Override
    public void displayService() {

//        SortById sortById = new SortById();
//        Collections.sort(saList, sortById);
        for (BankAccount sA : saList) {
            System.out.println(sA);
        }
//        WriteFileCSV.writeAccountToCSV(FILE_PATH,saList,false);
    }
}
