package case_study.models;

public class Booking {
    PCustomer customer = new PCustomer();
    FHouse house = new FHouse();
    FRoom room = new FRoom();
    FVilla villa = new FVilla();

    private String bookingId;
    private String startDay;
    private String endDay;
    private String customerId;
    private String serviceName;
    private String[] serviceType = {"Villa","House","Room"};



    public Booking() {

    }

    public Booking(String bookingId) {
        this.bookingId = bookingId;
        this.customerId = customer.getCustomerId();
    }

    public Booking(String serviceName, String[] rentalType, String bookingCode, String startDay, String endDay, String[] serviceType) {
        this.bookingId = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customer.getCustomerId();
        this.serviceType = serviceType;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String[] getServiceType() {
        return serviceType;
    }

    public void setServiceType(String[] serviceType) {
        this.serviceType = serviceType;
    }
}
