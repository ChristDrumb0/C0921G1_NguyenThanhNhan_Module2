package case_study.services.Impl;

import case_study.utils.Reader;
import case_study.utils.Writer;
import case_study.models.Booking;
import case_study.models.Facility;
import case_study.models.PCustomer;
import case_study.services.BookingService;
import case_study.services.CustomerService;
import case_study.services.FacilityService;
import case_study.utils.validation.ValidationRegex;

import java.util.*;

import static case_study.services.Impl.CustomerServiceImpl.CUSTOMER_PATH_FILE;
import static case_study.services.Impl.FacilityServiceImpl.FACILITY_PATH_FILE;

public class BookingServiceImpl implements BookingService {
    public static final String BOOKING_QUEUE_PATH = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\case_study\\data\\dataservice\\booking_queue.csv";
    static Scanner sc = new Scanner(System.in);
    public static final String BOOKING_PATH_FILE = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\case_study\\data\\dataservice\\booking.csv";
    TreeSet<Booking> bookingTreeSet = Reader.getBooking(BOOKING_PATH_FILE);
    Queue<Booking> queueBooking = Reader.getBookingQueue(BOOKING_QUEUE_PATH);
    static ValidationRegex valid = new ValidationRegex();
    FacilityService fs = new FacilityServiceImpl();
    public TreeSet<Booking> getBookingTreeSet() {
        return bookingTreeSet;
    }

    public Queue<Booking> getQueueBooking() {
        return queueBooking;
    }


    @Override
    public String getServiceType(String serviceId) {
        try {
            Map<Facility, Integer> facilityMap = Reader.getFacility(FACILITY_PATH_FILE);
            Set<Facility> keySet = facilityMap.keySet();
            String serviceType = null;

            for (Facility key : keySet) {
                if (key.getServiceId().equals(serviceId)) {
                    serviceType = key.serviceName;
                    break;
                }
            }
            return serviceType;
        }catch (NullPointerException e){
            e.printStackTrace();
            return "null";
        }
    }

    public void setBookingTreeSet(TreeSet<Booking> bookingTreeSet) {
        this.bookingTreeSet = bookingTreeSet;
    }

    @Override
    public String getCustomerId() {
        List<PCustomer> customerList = Reader.getCustomer(CUSTOMER_PATH_FILE);
        CustomerService cs = new CustomerServiceImpl();

        String customerId = "";
        boolean flag = true;
        while (flag) {

//                System.out.println("Nh???p m?? kh??ch h??ng theo b???ng sau");
            cs.displayService();
            customerId = valid.checkIdCus();

            for (PCustomer customer : customerList) {
                if (customer.getCustomerId().equals(customerId)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("kh??ng t??m th???y, vui l??ng nh???p l???i!");
            }
        }
        return customerId;

    }

    @Override
    public String getFacilityId() {
        Map<Facility, Integer> facilityMap = Reader.getFacility(FACILITY_PATH_FILE);
        Set<Facility> keySet = facilityMap.keySet();

        FacilityService fs = new FacilityServiceImpl();

        String idService = "";
        boolean flag = true;
        while (flag) {

            fs.displayService();
            idService = valid.checkIdFac();

            for (Facility key : keySet) {
                if (key.getServiceId().equals(idService)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.err.println("kh??ng tr??ng v???i h??? th???ng, vui l??ng nh???p l???i !");
            }
        }
        return idService;
    }

    @Override
    public void displayService() {
        TreeSet<Booking> bookingTreeSet = Reader.getBooking(BOOKING_PATH_FILE);
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking);
        }

    }

    @Override
    public void addService(Booking booking) {

        bookingTreeSet.add(booking);
        Writer.writeBookingTree(BOOKING_PATH_FILE,bookingTreeSet,false );
        //th??m s??? l???n s??? d???ng khi c?? booking
        fs.addUsingFacility(booking.getFacility());
        //add sang Queue
        for (Booking bK : bookingTreeSet) {
            queueBooking.add(bK);
        }
        Writer.writeBookingQueue(BOOKING_QUEUE_PATH, queueBooking, false);
    }

    @Override
    public void editService(Booking eId) {

    }


}
