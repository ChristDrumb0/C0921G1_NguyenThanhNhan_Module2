package bai_them_quan_ly_xe.controller;

import bai_them_quan_ly_xe.models.Truck;
import bai_them_quan_ly_xe.service.DangKiemXeTai;
import bai_them_quan_ly_xe.service.Imp.XeTaiService;

import java.util.Scanner;

public class TruckController {
    Scanner scanner = new Scanner(System.in);
    DangKiemXeTai dangKiemXeTai = new XeTaiService();
    public void addXeTai(){
        Truck xeTai = null;
        System.out.println("Vui lòng nhập 'biển kiểm soát'");
        String bKS = scanner.nextLine();
        System.out.println("Vui lòng nhập 'tên hãng sản xuất'");
        String tHSX = scanner.nextLine();
        System.out.println("Vui lòng nhập 'năm sản xuất'");
        int nSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Vui lòng nhập 'chủ sở hữu'");
        String cSH = scanner.nextLine();
        System.out.println("Vui lòng nhập 'tải trọng'");
        int tT = Integer.parseInt(scanner.nextLine());
        xeTai = new Truck(bKS,tHSX,nSX,cSH,tT);
        dangKiemXeTai.addVehicle(xeTai);
    }
    public void displayXeTai(){
        dangKiemXeTai.displayVehicle();
    }
    public void deleteXeTai(){
        System.out.println("Vui lòng nhập biển kiểm soát cần 'XÓA'");
        String bKS = scanner.nextLine();
        dangKiemXeTai.deleteVehicle(bKS);
    }
}
