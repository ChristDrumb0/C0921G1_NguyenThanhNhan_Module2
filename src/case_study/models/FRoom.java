package case_study.models;

public class FRoom extends Facility {
    private String serviceIncluded;

    public FRoom() {
    }

    public FRoom(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }

    public FRoom(String serviceName,String serviceId, double usableArea, double rentalCost, int capability, String rentalType, String serviceIncluded) {
        super(serviceName, serviceId,usableArea, rentalCost, capability, rentalType);
        this.serviceIncluded = serviceIncluded;
    }

    public String getServiceIncluded() {
        return serviceIncluded;
    }

    public void setServiceIncluded(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }

    @Override
    public String toString() {
        return super.toString() +
                ","+serviceIncluded;
    }
}
