package exam.module;

public class LegitPhone extends Phone{

    String guaranteeTime;
    String guaranteeArea;

    public LegitPhone() {
    }

    public LegitPhone(String type, int id, String phoneName, String price, int quantity, String manufacturer, String guaranteeTime, String guaranteeArea) {
        super(type, id, phoneName, price, quantity, manufacturer);
        this.guaranteeTime = guaranteeTime;
        this.guaranteeArea = guaranteeArea;
    }

    public String getGuaranteeTime() {
        return guaranteeTime;
    }

    public void setGuaranteeTime(String guaranteeTime) {
        this.guaranteeTime = guaranteeTime;
    }

    public String getGuaranteeArea() {
        return guaranteeArea;
    }

    public void setGuaranteeArea(String guaranteeArea) {
        this.guaranteeArea = guaranteeArea;
    }


    @Override
    public String toString() {
        return super.toString() +
                "," + guaranteeTime +
                "," + guaranteeArea ;
    }
}
