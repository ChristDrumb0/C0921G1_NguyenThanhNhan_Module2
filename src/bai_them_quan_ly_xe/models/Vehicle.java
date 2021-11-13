package bai_them_quan_ly_xe.models;

import java.util.ArrayList;

public class Vehicle {
    String bKS;
    String tenHSX;
    int namSX;
    String chuSH;

    public Vehicle() {
    }

    public Vehicle(String bKS, String tenHSX, int namSX, String chuSH) {
        this.bKS = bKS;
        this.tenHSX = tenHSX;
        this.namSX = namSX;
        this.chuSH = chuSH;
    }

    public String getbKS() {
        return bKS;
    }

    public void setbKS(String bKS) {
        this.bKS = bKS;
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

    public String getTenHSX() {
        for (int i = 0; i < hangSanXuat.size(); i++) {
            if(hangSanXuat.get(i).getMaSo().equals(this.tenHSX)){

                return hangSanXuat.get(i).getTen();
            }
        }
        return "Không tìm thấy hãng xe nào";
    }

    public void setTenHSX(String tenHSX) {
        this.tenHSX = tenHSX;
    }


    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSH() {
        return chuSH;
    }

    public void setChuSH(String chuSH) {
        this.chuSH = chuSH;
    }

    @Override
    public String toString() {
        return "Phương tiện: " +
                "biển kiểm soát: '" + bKS + '\'' +
                ", hãng sản xuất: '" + getTenHSX() + '\'' +
                ", năm sản xuất: '" + namSX + '\'' +
                ", chủ sở hữu: '" + chuSH + '\'' +
                '.';
    }
}
