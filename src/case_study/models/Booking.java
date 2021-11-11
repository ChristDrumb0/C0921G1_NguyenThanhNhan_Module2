package case_study.models;

public class Booking {
    private String bookingId;
    PCustomer customer;
    Facility facility;
    private String startDay;
    private String endDay;

    public Booking() {

    }

    public Booking(String bookingId, PCustomer customer, Facility facility, String startDay, String endDay) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.facility = facility;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public PCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(PCustomer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
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
}
