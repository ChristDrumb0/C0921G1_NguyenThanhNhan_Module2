package case_study.models;

public class FHouse extends Facility{
    private String roomStandard;
    private double floorsAmount;

    public FHouse() {
    }

    public FHouse(String roomStandard, double floorsAmount) {
        this.roomStandard = roomStandard;
        this.floorsAmount = floorsAmount;
    }

    public FHouse(String serviceName, double usableArea, double rentalCost, double capability, String[] rentalType, String roomStandard, double floorsAmount) {
        super(serviceName, usableArea, rentalCost, capability, rentalType);
        this.roomStandard = roomStandard;
        this.floorsAmount = floorsAmount;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getFloorsAmount() {
        return floorsAmount;
    }

    public void setFloorsAmount(double floorsAmount) {
        this.floorsAmount = floorsAmount;
    }
}
