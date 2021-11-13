package bai_them_quan_ly_xe.service.Imp;

import bai_them_quan_ly_xe.models.Car;
import bai_them_quan_ly_xe.models.Vehicle;
import bai_them_quan_ly_xe.service.DangKiemXeHoi;

import java.util.ArrayList;

public class XeHoiService implements DangKiemXeHoi {
    ArrayList<Car> xeHoiList = new ArrayList<>();
    {
        xeHoiList.add(new Car("43A-212.56","HSX-006",2019,"Nguyễn Văn A",1,3));
        xeHoiList.add(new Car("43B-453.88","HSX-004",2020,"Nguyễn Văn B",2,45));
        xeHoiList.add(new Car("43B-453.89","HSX-005",2020,"Nguyễn Văn C",2,16));
    }
    @Override
    public  void addVehicle(Car xeHoi) {
        xeHoiList.add(xeHoi);
    }

//    ArrayList<Car> xeHoiListClone = (ArrayList<Car>) xeHoiList.clone();

    @Override
    public void displayVehicle() {
        for (Car xeHoiD : xeHoiList) {
            System.out.println(xeHoiD);
        }
    }

    @Override
    public void deleteVehicle(String bKS) {
        for (int i = 0; i < xeHoiList.size(); i++) {
            if(xeHoiList.get(i).getbKS().equals(bKS)){
                xeHoiList.remove(i);
            }
        }
    }
}
