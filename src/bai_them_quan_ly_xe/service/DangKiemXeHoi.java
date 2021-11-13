package bai_them_quan_ly_xe.service;

import bai_them_quan_ly_xe.models.Car;

public interface DangKiemXeHoi {
    void addVehicle(Car xeHoi);
    void displayVehicle();
    void deleteVehicle(String bKS);
}
