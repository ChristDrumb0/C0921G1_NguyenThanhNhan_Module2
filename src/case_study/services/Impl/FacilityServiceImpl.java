package case_study.services.Impl;

import case_study.data.dataservice.Reader;
import case_study.data.dataservice.Writer;
import case_study.models.FHouse;
import case_study.models.FRoom;
import case_study.models.FVilla;
import case_study.models.Facility;
import case_study.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public static final String PATH_FILE = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\case_study\\data\\dataservice\\facility.csv";
    public Map<? super Facility,Integer> facilityMap = Reader.getFacility(PATH_FILE);

//    public Map<? super Facility,Integer> facilityMap = new LinkedHashMap();
//    {
//        facilityMap.put(new FRoom("Room","SVRO0001",80,105.7,2,"type","include"),1);
//        facilityMap.put(new FVilla("Villa","SVVL0001",150,1005.6,9,"type","4 phong",35,3),5);
//        facilityMap.put(new FHouse("House","SVHO0001",120,500.5,9,"type","4 phong",3),7);
//    }

    Scanner sc = new Scanner(System.in);


    @Override
    public void displayMaintenance() {
        for (Map.Entry<? super Facility, Integer> entry: facilityMap.entrySet()){
            if (entry.getValue() >= 5) {
                if(entry.getKey() instanceof FRoom){
                    System.out.println("Phòng" + ((FRoom) entry.getKey()).getServiceId() + " Đã sử dụng "+entry.getValue()+ " lần, cần được 'Bảo Trì' !");
                }
                else if(entry.getKey() instanceof FVilla){
                    System.out.println("Phòng" + ((FVilla) entry.getKey()).getServiceId() + " Đã sử dụng "+entry.getValue()+ " lần, cần được 'Bảo Trì' !");
                }
                else if(entry.getKey() instanceof FHouse){
                    System.out.println("Phòng" + ((FHouse) entry.getKey()).getServiceId() + " Đã sử dụng "+entry.getValue()+ " lần, cần được 'Bảo Trì' !");
                }

            }
        }
    }

    @Override
    public void addRoom(Facility facility) {

        facilityMap.put(facility,0);
        Writer.writeFacilityToCSV(PATH_FILE,facilityMap,false);
    }

    @Override
    public void addVilla(Facility facility) {

        facilityMap.put(facility,0);
        Writer.writeFacilityToCSV(PATH_FILE,facilityMap,false);
    }

    @Override
    public void addHouse(Facility facility) {

        facilityMap.put(facility,0);
        Writer.writeFacilityToCSV(PATH_FILE,facilityMap,false);
    }

    @Override
    public void displayService() {
        for (Map.Entry<? super Facility, Integer> entry: facilityMap.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

    }

    @Override
    public void addService(Facility facility) {

    }

    @Override
    public void editService(Facility eId) {

    }
}
