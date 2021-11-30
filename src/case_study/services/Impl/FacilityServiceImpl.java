package case_study.services.Impl;

import case_study.models.FHouse;
import case_study.models.FRoom;
import case_study.models.FVilla;
import case_study.models.Facility;
import case_study.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public Map<Facility,Integer> facilityMap = new LinkedHashMap();
    {
        facilityMap.put(new FRoom("roomName",80,105.7,9,"type","include"),1);
    }
    Facility facility;
    Scanner sc = new Scanner(System.in);


    @Override
    public void addRoom() {
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
        facility = new FRoom(roomName,area,rental,capacity,type,include);
        facilityMap.put(facility,0);
    }

    @Override
    public void addVilla() {
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
        facility = new FVilla(roomName,area,rental,capacity,type,standard,poolArea,stories);
        facilityMap.put(facility,0);
    }

    @Override
    public void addHouse() {
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
        facility = new FHouse(roomName,area,rental,capacity,type,standard,stories);
        facilityMap.put(facility,0);
    }

    @Override
    public void displayService() {
        for (Map.Entry<Facility, Integer> entry: facilityMap.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

    }

    @Override
    public void addService(Facility facility) {

    }

    @Override
    public void editService(Facility eId) {

    }
}
