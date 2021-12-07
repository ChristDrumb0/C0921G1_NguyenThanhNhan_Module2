package exam.controller;



import exam.service.imp.ImpPhoneService;

import java.util.Scanner;

public class MainController {
    public void Controller() {
        ImpPhoneService phones = new ImpPhoneService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----Phone Managerment---- \n" +
                    "1. Add Phone\n" +
                    "2. Delete Phone\n" +
                    "3. Display Phone\n" +
                    "4. Search Phone\n" +
                    "5. Exit\n" +
                    "Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-=Add Phone=-");
                    phones.addService();
                    break;
                case 2:
                    System.out.println("-=Delete Phone=-");
                    phones.deleteService();

                    break;
                case 3:
                    System.out.println("-=Display Phone=-");
                    phones.displayService();

                    break;

                case 4:
                    System.out.println("-=Search Phone=-");
                    phones.searchService();
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
