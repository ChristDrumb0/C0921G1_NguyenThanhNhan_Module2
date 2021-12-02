package case_study.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking implements Comparable<Booking>{
    private String bookingId;
    String customerId;
    String facilityId;
    String facilityType;
    private String startDay;
    private String endDay;

    public Booking() {

    }

    public Booking(String bookingId, String customerId, String facilityId,String facilityType, String startDay, String endDay) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.facilityId = facilityId;
        this.facilityType = facilityType;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomer() {
        return customerId;
    }

    public void setCustomer(String customerId) {
        this.customerId = customerId;
    }

    public String getFacility() {
        return facilityId;
    }

    public void setFacility(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    @Override
    public String toString() {
        return bookingId +
                ","+customerId +
                ","+facilityId +
                ","+facilityType +
                ","+startDay +
                ","+endDay ;
    }

    @Override
    public int compareTo(Booking o) {
        try {
            Date date1 = null;
            Date date2 = null;
            if (getStartDay().equals(o.getStartDay())) {
                try {
                    date1 = new SimpleDateFormat("dd/MM/yyyy").parse(getEndDay());
                    date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o.getEndDay());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    date1 = new SimpleDateFormat("dd/MM/yyyy").parse(getStartDay());
                    date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o.getStartDay());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
            return date1.compareTo(date2);
        }
        catch (NullPointerException e){
            return 0;
        }

    }
}
