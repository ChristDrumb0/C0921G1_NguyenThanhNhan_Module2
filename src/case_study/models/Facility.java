package case_study.models;

import java.util.Arrays;
import java.util.Objects;

public abstract class Facility {

    public String serviceName;
    public String serviceId;
    private double usableArea;
    private double rentalCost;
    private int capability;
    private String rentalType ;

    public Facility() {
    }


    public Facility(String serviceName, String serviceId, double usableArea, double rentalCost, int capability, String rentalType) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.capability = capability;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getCapability() {
        return capability;
    }

    public void setCapability(int capability) {
        this.capability = capability;
    }

    public String getRentalType() {
        return rentalType;
    }



    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return serviceName +
                ","+ serviceId +
                ","+ usableArea +
                ","+ rentalCost +
                ","+ capability +
                ","+ rentalType ;
    }
//    @Override
//    public String toString() {
//        return "service: '" + serviceName + '\'' +
//                ", usableArea: " + usableArea +
//                ", rentalCost: " + rentalCost +
//                ", capability: " + capability +
//                ", rentalType: " + rentalType ;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return serviceId.equals(facility.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId);
    }
}

