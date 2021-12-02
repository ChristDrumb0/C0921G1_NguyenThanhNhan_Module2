package case_study.controller;

import case_study.models.Booking;
import case_study.services.BookingService;
import case_study.services.Impl.BookingServiceImpl;

import java.util.Scanner;

public class BookingController {
    Scanner sc = new Scanner(System.in);
    BookingService bookings = new BookingServiceImpl();

    public void addBooking() {

        String bookingId = "";

        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập booking Id");
                bookingId = sc.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

            flag = false;
            for (Booking booking : bookings.getBookingTreeSet()) {
                if (booking.getBookingId().equals(bookingId)) {
                    System.out.println("Đã có booking, vui lòng nhập mã khác");
                    flag = true;
                    break;
                }
            }
        }
        String idCustomer = bookings.getCustomerId();
        String idFacility = bookings.getFacilityId();
        System.out.println("Enter start date");
        String startDate = sc.nextLine();
        System.out.println("Enter end date");
        String endDate = sc.nextLine();
        String serviceType = bookings.getServiceType(idFacility);
        System.out.println(serviceType);
        Booking booking = new Booking(bookingId, idCustomer, idFacility, serviceType, startDate, endDate);
        bookings.addService(booking);
    }

    public void displayBooking() {
        bookings.displayService();
    }
}
