package case_study.controller;

import case_study.models.FHouse;
import case_study.models.FRoom;
import case_study.models.FVilla;
import case_study.models.Facility;
import case_study.services.FacilityService;
import case_study.services.Impl.FacilityServiceImpl;
import case_study.utils.validation.ValidationRegex;

import java.util.Scanner;

public class FacilityController {
    FacilityService facilities = new FacilityServiceImpl();
    Scanner sc = new Scanner(System.in);

    public void displayFacility(){
        facilities.displayService();
    }

    public void maintenaceDisplay(){

        facilities.displayMaintenance();
    }
    ValidationRegex valid = new ValidationRegex();
    public void addRoom(){
        System.out.println("Nhập tên dịch vụ");
        String serName = sc.nextLine();
        String roomId = valid.checkIdFac();
        System.out.println("Nhập diện tích sử dụng");
        double area = valid.checkArea();
        System.out.println("Nhập giá thuê");
        double rental = valid.checkRental();
        System.out.println("Nhập sức chứa");
        int capacity = valid.checkStories();
        System.out.println("Nhập loại thuê");
        String type = sc.nextLine();
        System.out.println("Nhập dịch vụ đi kèm");
        String include = sc.nextLine();
        Facility room = new FRoom(serName,roomId,area,rental,capacity,type,include);
        facilities.addRoom(room);
    }
    public void addVilla(){
        System.out.println("Nhập tên dịch vụ");
        String serName = sc.nextLine();
        String roomId = valid.checkIdFac();
        System.out.println("Nhập diện tích sử dụng");
        double area = valid.checkArea();
        System.out.println("Nhập giá thuê");
        double rental = valid.checkRental();
        System.out.println("Nhập sức chứa");
        int capacity = valid.checkStories();
        System.out.println("Nhập loại thuê");
        String type = sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phong");
        String standard = sc.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = valid.checkArea();
        System.out.println("Nhập số tâng");
        int stories = valid.checkStories();
        Facility villa = new FVilla(serName,roomId,area,rental,capacity,type,standard,poolArea,stories);
        facilities.addVilla(villa);
    }

    public void addHouse(){
        System.out.println("Nhập tên dịch vụ");
        String serName = sc.nextLine();
        String roomId = valid.checkIdFac();
        System.out.println("Nhập diện tích sử dụng");
        double area = valid.checkArea();
        System.out.println("Nhập giá thuê");
        double rental = valid.checkRental();
        System.out.println("Nhập sức chứa");
        int capacity = valid.checkStories();
        System.out.println("Nhập loại thuê");
        String type = sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phong");
        String standard = sc.nextLine();
        System.out.println("Nhập số tâng");
        int stories = valid.checkStories();
        Facility house = new FHouse(serName,roomId,area,rental,capacity,type,standard,stories);
        facilities.addHouse(house);
    }
}
