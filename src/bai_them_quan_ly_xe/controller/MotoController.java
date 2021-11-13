package bai_them_quan_ly_xe.controller;

import bai_them_quan_ly_xe.models.Motorcycle;
import bai_them_quan_ly_xe.service.DangKiemXeMay;
import bai_them_quan_ly_xe.service.Imp.XeMayService;

import java.util.Scanner;

public class MotoController {
    Scanner scanner = new Scanner(System.in);
    DangKiemXeMay dangKiemXeMay = new XeMayService();
    public void addXeMay(){
        Motorcycle xeMay = null;
        System.out.println("Vui lòng nhập 'biển kiểm soát'");
        String bKS = scanner.nextLine();
        System.out.println("Vui lòng nhập 'tên hãng sản xuất'");
        String tHSX = scanner.nextLine();
        System.out.println("Vui lòng nhập 'năm sản xuất'");
        int nSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Vui lòng nhập 'chủ sở hữu'");
        String cSH = scanner.nextLine();
        System.out.println("Vui lòng nhập 'phân khối'");
        int pK = Integer.parseInt(scanner.nextLine());
        xeMay = new Motorcycle(bKS,tHSX,nSX,cSH,pK);
        dangKiemXeMay.addVehicle(xeMay);
    }
    public void displayXeMay(){
        dangKiemXeMay.displayVehicle();
    }
    public void deleteXeMay(){
        System.out.println("Vui lòng nhập biển kiểm soát cần 'XÓA'");
        String bKS = scanner.nextLine();
        dangKiemXeMay.deleteVehicle(bKS);
    }
}
