package case_study.models;

public class FVilla extends Facility{
    private String roomStandard;
    private double poolArea;
    private double floorsAmount;

    public FVilla() {
    }

    public FVilla(String serviceName, double usableArea, double rentalCost, double capability, String[] rentalType, String roomStandard, double poolArea, double floorsAmount) {
        super(serviceName, usableArea, rentalCost, capability, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorsAmount = floorsAmount;
    }

    public FVilla(String roomStandard, double poolArea, double floorsAmount) {
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

    public double getFloorsAmount() {
        return floorsAmount;
    }

    public void setFloorsAmount(double floorsAmount) {
        this.floorsAmount = floorsAmount;
    }
}
