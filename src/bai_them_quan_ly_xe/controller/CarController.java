package bai_them_quan_ly_xe.controller;

import bai_them_quan_ly_xe.models.Car;
import bai_them_quan_ly_xe.models.Vehicle;
import bai_them_quan_ly_xe.service.DangKiemXeHoi;
import bai_them_quan_ly_xe.service.Imp.XeHoiService;

import java.util.Scanner;

public class CarController {
    Scanner scanner = new Scanner(System.in);
    DangKiemXeHoi dangKiemXeHoi = new XeHoiService();
    public void addXeHoi(){
        Car xeHoi = null;
        System.out.println("Vui lòng nhập 'biển kiểm soát'");
        String bKS = scanner.nextLine();
        System.out.println("Vui lòng nhập 'tên hãng sản xuất'");
        String tHSX = scanner.nextLine();
        System.out.println("Vui lòng nhập 'năm sản xuất'");
        int nSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Vui lòng nhập 'chủ sở hữu'");
        String cSH = scanner.nextLine();
        System.out.println("Vui lòng nhập 'kiểu xe(1 hoặc 2)'");
        int kX = Integer.parseInt(scanner.nextLine());
        System.out.println("Vui lòng nhập 'số chỗ ngồi'");
        int sCh = Integer.parseInt(scanner.nextLine());
        xeHoi = new Car(bKS,tHSX,nSX,cSH,kX,sCh);
        dangKiemXeHoi.addVehicle(xeHoi);
    }
    public void displayXeHoi(){
        dangKiemXeHoi.displayVehicle();
    }
    public void deleteXeHoi(){
        System.out.println("Vui lòng nhập biển kiểm soát cần 'XÓA'");
        String bKS = scanner.nextLine();
        dangKiemXeHoi.deleteVehicle(bKS);
    }

}
