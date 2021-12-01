package case_study.services.Impl;

import case_study.models.FHouse;
import case_study.models.FRoom;
import case_study.models.FVilla;
import case_study.models.Facility;
import case_study.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public Map<? super Facility,Integer> facilityMap = new LinkedHashMap();
    {
        facilityMap.put(new FRoom(" RO001 ",80,105.7,2,"type","include"),1);
        facilityMap.put(new FVilla(" VL001 ",150,1005.6,9,"type","4 phong", 35,3),5);
        facilityMap.put(new FHouse(" HO001 ",120,500.5,9,"type","4 phong",3),7);
    }
    Facility facility;
    Scanner sc = new Scanner(System.in);


    @Override
    public void displayMaintenance() {
        for (Map.Entry<? super Facility, Integer> entry: facilityMap.entrySet()){
            if (entry.getValue() >= 5) {
                if(entry.getKey() instanceof FRoom){
                    System.out.println("Phòng" + ((FRoom) entry.getKey()).getServiceName() + " Đã sử dụng "+entry.getValue()+ " lần, cần được 'Bảo Trì' !");
                }
                else if(entry.getKey() instanceof FVilla){
                    System.out.println("Phòng" + ((FVilla) entry.getKey()).getServiceName() + " Đã sử dụng "+entry.getValue()+ " lần, cần được 'Bảo Trì' !");
                }
                else if(entry.getKey() instanceof FHouse){
                    System.out.println("Phòng" + ((FHouse) entry.getKey()).getServiceName() + " Đã sử dụng "+entry.getValue()+ " lần, cần được 'Bảo Trì' !");
                }

            }
        }
    }

    @Override
    public void addRoom(Facility facility) {

        facilityMap.put(facility,0);
    }

    @Override
    public void addVilla(Facility facility) {

        facilityMap.put(facility,0);
    }

    @Override
    public void addHouse(Facility facility) {

        facilityMap.put(facility,0);
    }

    @Override
    public void displayService() {
        for (Map.Entry<? super Facility, Integer> entry: facilityMap.entrySet()){
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
