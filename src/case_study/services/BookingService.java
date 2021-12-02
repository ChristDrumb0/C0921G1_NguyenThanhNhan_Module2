package case_study.services;

import case_study.models.Booking;

import java.util.TreeSet;

public interface BookingService extends Service<Booking>{
    String getCustomerId();
    String getFacilityId();
    TreeSet<Booking> getBookingTreeSet();
    String getServiceType(String serviceType);
}
