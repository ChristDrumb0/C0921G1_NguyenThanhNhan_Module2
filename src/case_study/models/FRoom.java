package case_study.models;

public class FRoom extends Facility {
    private String serviceIncluded;

    public FRoom() {
    }

    public FRoom(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }

    public FRoom(String serviceName, double usableArea, double rentalCost, double capability, String rentalType, String serviceIncluded) {
        super(serviceName, usableArea, rentalCost, capability, rentalType);
        this.serviceIncluded = serviceIncluded;
    }

    public String getServiceIncluded() {
        return serviceIncluded;
    }

    public void setServiceIncluded(String serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }
}
