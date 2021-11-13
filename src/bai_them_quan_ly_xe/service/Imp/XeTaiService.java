package bai_them_quan_ly_xe.service.Imp;

import bai_them_quan_ly_xe.models.Manufacturer;
import bai_them_quan_ly_xe.models.Truck;
import bai_them_quan_ly_xe.service.DangKiemXeTai;

import java.util.ArrayList;

public class XeTaiService implements DangKiemXeTai {
    ArrayList<Truck> xeTaiList = new ArrayList<>();
    {
        xeTaiList.add(new Truck("43C-012.34","HSX-004",2019,"Nguyễn Văn A",3));
        xeTaiList.add(new Truck("43C-47.678","HSX-003",2020,"Nguyễn Văn B",9));
        xeTaiList.add(new Truck("43C-45.235","HSX-007",2021,"Nguyễn Văn C",12));
    }
    ArrayList<Manufacturer> hangSanXuat = new ArrayList<>();
    {
        hangSanXuat.add(new Manufacturer("HSX-001","Yamaha","Nhật Bản"));
        hangSanXuat.add(new Manufacturer("HSX-002","Honda","Nhật Bản"));
        hangSanXuat.add(new Manufacturer("HSX-003","Dongfeng","Trung Quốc"));
        hangSanXuat.add(new Manufacturer("HSX-004","Hyundai","Hàn Quốc"));
        hangSanXuat.add(new Manufacturer("HSX-005","Ford","Mỹ"));
        hangSanXuat.add(new Manufacturer("HSX-006","Toyota","Nhật Bản"));
        hangSanXuat.add(new Manufacturer("HSX-007","Hino","Nhật Bản"));
        hangSanXuat.add(new Manufacturer("HSX-008","Ducati","Ý"));

    }

    @Override
    public void addVehicle(Truck xeTai) {
        xeTaiList.add(xeTai);
    }

    @Override
    public void displayVehicle() {
        for (Truck xeTaiD : xeTaiList) {
            System.out.println(xeTaiD);
        }
    }

    @Override
    public void deleteVehicle(String bKS) {
        for (int i = 0; i < xeTaiList.size(); i++) {
            if(xeTaiList.get(i).getbKS().equals(bKS)){
                xeTaiList.remove(i);
            }
        }
    }
}
