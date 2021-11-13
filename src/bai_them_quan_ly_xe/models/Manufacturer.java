package bai_them_quan_ly_xe.models;

public class Manufacturer {
    String maSo;
    String ten;
    String quocGia;

    public Manufacturer() {
    }

    public Manufacturer(String maSo, String ten, String quocGia) {
        this.maSo = maSo;
        this.ten = ten;
        this.quocGia = quocGia;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
