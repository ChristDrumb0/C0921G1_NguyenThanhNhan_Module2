package bai_them_quan_ly_xe.service;

import bai_them_quan_ly_xe.models.Truck;

public interface DangKiemXeTai {
    void addVehicle(Truck xeTai);
    void displayVehicle();
    void deleteVehicle(String bKS);
}
