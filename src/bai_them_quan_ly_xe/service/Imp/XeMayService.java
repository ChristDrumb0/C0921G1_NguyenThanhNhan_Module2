package bai_them_quan_ly_xe.service.Imp;

import bai_them_quan_ly_xe.models.Motorcycle;
import bai_them_quan_ly_xe.models.Truck;
import bai_them_quan_ly_xe.service.DangKiemXeMay;

import java.util.ArrayList;

public class XeMayService implements DangKiemXeMay {
    ArrayList<Motorcycle> xeMayList = new ArrayList<>();
    {
        xeMayList.add(new Motorcycle("43-A1-678.56","HSX-008",2019,"Nguyễn Văn A",1103));
        xeMayList.add(new Motorcycle("43-H1-345.89","HSX-002",2019,"Nguyễn Văn B",150));
        xeMayList.add(new Motorcycle("43-AK-765.23","HSX-001",2019,"Nguyễn Văn C",50));

    }

    @Override
    public void addVehicle(Motorcycle xeMay) {
        xeMayList.add(xeMay);
    }

    @Override
    public void displayVehicle() {
        for (Motorcycle motoD : xeMayList) {
            System.out.println(motoD);
        }
    }

    @Override
    public void deleteVehicle(String bKS) {
        for (int i = 0; i < xeMayList.size(); i++) {
            if(xeMayList.get(i).getbKS().equals(bKS)){
                xeMayList.remove(i);
            }
        }
    }
}
