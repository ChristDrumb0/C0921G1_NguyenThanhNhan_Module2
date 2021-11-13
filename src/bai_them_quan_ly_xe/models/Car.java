package bai_them_quan_ly_xe.models;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Car extends Vehicle {
    int soCho;
    int kieuXe;

    public Car() {
    }

    public Car(String bKS, String tenHSX, int namSX, String chuSH, int kieuXe,int soCho ) {
        super(bKS, tenHSX, namSX, chuSH);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuXe() {
        return kieuXe == 1 ? "Du lịch" : "Xe khách";

    }

    public void setKieuXe(int kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Xe hơi:" +
                " biển kiểm soát: '" + bKS + '\'' +
                ", hãng sản xuất: '" + getTenHSX() + '\'' +
                ", năm sản xuất: '" + namSX + '\'' +
                ", chủ sở hữu: '" + chuSH + '\'' +
                ", kiểu xe: '" + getKieuXe() + '\'' +
                ", số chỗ: '" + soCho + '\''  +
                '.';
    }
}
