package nhap.case08.controller;

import nhap.case08.service.Imp.ImpAccount;

import java.util.Scanner;

public class MainController {
    public void Controller() {
        ImpAccount bankaccount = new ImpAccount();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----Bank's Account Managerment---- \n" +
                    "1. Add new account \n" +
                    "2. Delete account \n" +
                    "3. Display all account \n" +
                    "4. Search account\n" +
                    "5. Exit\n" +
                    "Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-=Add new account=-");
                    bankaccount.addService();
                    break;
                case 2:
                    System.out.println("-=Delete account=-");
                    bankaccount.deleteService();
                    break;
                case 3:
                    System.out.println("-=Display all account=-");
                    bankaccount.displayService();
                    break;
                case 4:
                    System.out.println("-=Search account=-");
                    bankaccount.searchService();
                    break;
                case 5:
                    System.out.println("-=Exit=-");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a choice");

            }

        }

    }

}
