package case_study.models;

public class FHouse extends Facility{
    private String roomStandard;
    private int floorsAmount;

    public FHouse() {
    }

//    public FHouse(String roomStandard, double floorsAmount) {
//        this.roomStandard = roomStandard;
//        this.floorsAmount = floorsAmount;
//    }

    public FHouse(String serviceName, double usableArea, double rentalCost, double capability, String rentalType, String roomStandard, int floorsAmount) {
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

    public int getFloorsAmount() {
        return floorsAmount;
    }

    public void setFloorsAmount(int floorsAmount) {
        this.floorsAmount = floorsAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", roomStandard: '" + roomStandard + '\'' +
                ", floorsAmount: " + floorsAmount +
                '.';
    }

}
