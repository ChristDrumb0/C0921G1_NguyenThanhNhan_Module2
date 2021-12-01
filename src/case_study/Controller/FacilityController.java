package case_study.controller;

import case_study.models.FHouse;
import case_study.models.FRoom;
import case_study.models.FVilla;
import case_study.models.Facility;
import case_study.services.FacilityService;
import case_study.services.Impl.FacilityServiceImpl;

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

    public void addRoom(){
        System.out.println("Nhập tên phòng");
        String roomName = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double area = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá thuê");
        double rental = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập sức chứa");
        double capacity = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập loại thuê");
        String type = sc.nextLine();
        System.out.println("Nhập dịch vụ đi kèm");
        String include = sc.nextLine();
        Facility room = new FRoom(roomName,area,rental,capacity,type,include);
        facilities.addRoom(room);
    }
    public void addVilla(){
        System.out.println("Nhập tên phòng");
        String roomName = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double area = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá thuê");
        double rental = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập sức chứa");
        double capacity = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập loại thuê");
        String type = sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phong");
        String standard = sc.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tâng");
        int stories = Integer.parseInt(sc.nextLine());
        Facility villa = new FVilla(roomName,area,rental,capacity,type,standard,poolArea,stories);
        facilities.addVilla(villa);
    }

    public void addHouse(){
        System.out.println("Nhập tên phòng");
        String roomName = sc.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double area = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá thuê");
        double rental = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập sức chứa");
        double capacity = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập loại thuê");
        String type = sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phong");
        String standard = sc.nextLine();
        System.out.println("Nhập số tâng");
        int stories = Integer.parseInt(sc.nextLine());
        Facility house = new FHouse(roomName,area,rental,capacity,type,standard,stories);
        facilities.addHouse(house);
    }
}
