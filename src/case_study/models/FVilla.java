package case_study.models;

public class FVilla extends Facility{
    private String roomStandard;
    private double poolArea;
    private int floorsAmount;

    public FVilla() {
    }

    public FVilla(String serviceName,String serviceId, double usableArea, double rentalCost, int capability,
                  String rentalType, String roomStandard, double poolArea, int floorsAmount) {
        super(serviceName,serviceId, usableArea, rentalCost, capability, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorsAmount = floorsAmount;
    }

    public FVilla(String roomStandard, double poolArea, int floorsAmount) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorsAmount = floorsAmount;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorsAmount() {
        return floorsAmount;
    }

    public void setFloorsAmount(int floorsAmount) {
        this.floorsAmount = floorsAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ","+ roomStandard +
                ","+ poolArea +
                ","+ floorsAmount;
    }
}
