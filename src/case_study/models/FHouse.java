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

    public FHouse(String serviceName,String serviceId, double usableArea, double rentalCost, int capability, String rentalType, String roomStandard, int floorsAmount) {
        super(serviceName,serviceId, usableArea, rentalCost, capability, rentalType);
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
                ","+roomStandard +
                ","+ floorsAmount;
    }

}
