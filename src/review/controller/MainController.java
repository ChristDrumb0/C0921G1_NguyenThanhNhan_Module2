package review.controller;

import review.models.Candidate;
import review.models.Experienced;
import review.models.Fresher;
import review.models.Internship;
import review.service.imp.ImpCandidates;

import java.util.Scanner;

public class MainController {
    public void Controller() {
        ImpCandidates cans = new ImpCandidates();

        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input Candidates \n" +
                    "1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Internship\n" +
                    "4. Searching\n" +
                    "5. Exit\n"+
                    "Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {

                case 1:
                    String isYes1;
                    do {
                        System.out.println("_______________________________");
                        System.out.println("input a Experience Candidate");
                        System.out.println("input Candidate's id");
                        String canId = sc.nextLine();
                        System.out.println("input Candidate's first name");
                        String canFName = sc.nextLine();
                        System.out.println("input Candidate's last name");
                        String canLName = sc.nextLine();
                        System.out.println("input Candidate's day of birth");
                        int canDoB = Integer.parseInt(sc.nextLine());
                        System.out.println("input Candidate's address");
                        String canAddress = sc.nextLine();
                        System.out.println("input Candidate's phone");
                        String canPhone = sc.nextLine();
                        System.out.println("input Candidate's email");
                        String canEmail = sc.nextLine();
                        int canType = choice - 1;
                        System.out.println("input Candidate's years of experience");
                        int canYoExp = Integer.parseInt(sc.nextLine());
                        System.out.println("input Candidate's professional skill");
                        String canSkill = sc.nextLine();
                        Experienced canEx = new Experienced(canId, canFName, canLName, canDoB, canAddress, canPhone, canEmail, canType, canYoExp, canSkill);
                        cans.addExpert(canEx);
                        System.out.println("Do you want to continue to input(Y/N)");
                        isYes1 = sc.nextLine();
                    }while (isYes1.equals("y")||isYes1.equals("Y"));

                    System.out.println("Input succeeded");
                    cans.displayCandidates();
                    System.out.println("_______________________________");
                    break;
                case 2:
                    String isYes2;
                    do {
                        System.out.println("_______________________________");
                        System.out.println("input a Fresher Candidate");
                        System.out.println("input Candidate's id");
                        String canId2 = sc.nextLine();
                        System.out.println("input Candidate's first name");
                        String canFName2 = sc.nextLine();
                        System.out.println("input Candidate's last name");
                        String canLName2 = sc.nextLine();
                        System.out.println("input Candidate's day of birth");
                        int canDoB2 = Integer.parseInt(sc.nextLine());
                        System.out.println("input Candidate's address");
                        String canAddress2 = sc.nextLine();
                        System.out.println("input Candidate's phone");
                        String canPhone2 = sc.nextLine();
                        System.out.println("input Candidate's email");
                        String canEmail2 = sc.nextLine();
                        int canType2 = choice - 1;
                        System.out.println("input Candidate's years of Graduate");
                        int canYoG = Integer.parseInt(sc.nextLine());
                        System.out.println("input Candidate's rank of graduation");
                        int canRoG = Integer.parseInt(sc.nextLine());
                        System.out.println("input Candidate's School");
                        String canSchool = sc.nextLine();
                        Fresher canFr = new Fresher(canId2, canFName2, canLName2, canDoB2, canAddress2, canPhone2, canEmail2, canType2, canYoG, canRoG, canSchool);
                        cans.addFresher(canFr);
                        System.out.println("Do you want to continue to input(Y/N)");
                        isYes2 =sc.nextLine();
                    }while(isYes2.equals("y")||isYes2.equals("Y"));
                    System.out.println("Input succeeded");
                    cans.displayCandidates();
                    System.out.println("_______________________________");
                    break;
                case 3:
                    String isYes3;
                    do {
                        System.out.println("_______________________________");
                        System.out.println("input a Intern Candidate");
                        System.out.println("input Candidate's id");
                        String canId3 = sc.nextLine();
                        System.out.println("input Candidate's first name");
                        String canFName3 = sc.nextLine();
                        System.out.println("input Candidate's last name");
                        String canLName3 = sc.nextLine();
                        System.out.println("input Candidate's day of birth");
                        int canDoB3 = Integer.parseInt(sc.nextLine());
                        System.out.println("input Candidate's address");
                        String canAddress3 = sc.nextLine();
                        System.out.println("input Candidate's phone");
                        String canPhone3 = sc.nextLine();
                        System.out.println("input Candidate's email");
                        String canEmail3 = sc.nextLine();
                        int canType3 = choice - 1;
                        System.out.println("input Candidate's major");
                        String canMajor = sc.nextLine();
                        System.out.println("input Candidate's semester");
                        String canSem = sc.nextLine();
                        System.out.println("input Candidate's school");
                        String canSchools = sc.nextLine();
                        Internship canInt = new Internship(canId3, canFName3, canLName3, canDoB3, canAddress3, canPhone3, canEmail3, canType3, canMajor, canSem, canSchools);
                        cans.addIntern(canInt);
                        System.out.println("Do you want to continue to input(Y/N)");
                        isYes3 = sc.nextLine();
                    }while(isYes3.equals("y")||isYes3.equals("Y"));

                    System.out.println("Input succeeded");
                    cans.displayCandidates();
                    System.out.println("_______________________________");
                    break;
                case 4:
                    System.out.println("_______________________________");
                    System.out.println("input Candidate Id");
                    String canId = sc.nextLine();
                    System.out.println(cans.searchCans(canId));
                    System.out.println("_______________________________");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("cho cơ hội làm lại đó!!");
            }
        }
    }
}
