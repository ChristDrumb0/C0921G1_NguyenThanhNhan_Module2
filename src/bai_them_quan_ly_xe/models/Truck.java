package bai_them_quan_ly_xe.models;

public class Truck extends Vehicle{
    int taiTrong;

    public Truck() {
    }

    public Truck(String bKS, String tenHSX, int namSX, String chuSH, int taiTrong) {
        super(bKS, tenHSX, namSX, chuSH);
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "Xe tải:" +
                " biển kiểm soát: '" + bKS + '\'' +
                ", hãng sản xuất: '" + getTenHSX() + '\'' +
                ", năm sản xuất: '" + namSX + '\'' +
                ", chủ sở hữu: '" + chuSH + '\'' +
                ", tải trọng: '" + taiTrong + " Tấn' "  +
                '.';
    }
}
