package bai_them_quan_ly_xe.service;

import bai_them_quan_ly_xe.models.Motorcycle;

public interface DangKiemXeMay {
    void addVehicle(Motorcycle xeMay);
    void displayVehicle();
    void deleteVehicle(String bKS);
}
