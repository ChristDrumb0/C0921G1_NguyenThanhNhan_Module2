package bai_them_quan_ly_xe.models;

public class Motorcycle extends Vehicle{
    int  dungTich;

    public Motorcycle() {
    }

    public Motorcycle(String bKS, String tenHSX, int namSX, String chuSH, int dungTich) {
        super(bKS, tenHSX, namSX, chuSH);
        this.dungTich = dungTich;
    }

    public int getCongSuat() {
        return dungTich;
    }

    public void setCongSuat(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "Xe máy:" +
                " biển kiểm soát: '" + bKS + '\'' +
                ", hãng sản xuất: '" + getTenHSX() + '\'' +
                ", năm sản xuất: '" + namSX + '\'' +
                ", chủ sở hữu: '" + chuSH + '\'' +
                ", dung tích: '" + dungTich + "cc'"  +
                '.';
    }
}
