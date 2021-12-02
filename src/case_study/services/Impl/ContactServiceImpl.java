package case_study.services.Impl;

import case_study.data.dataservice.Reader;
import case_study.data.dataservice.Writer;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.services.ContactService;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import static case_study.services.Impl.BookingServiceImpl.BOOKING_QUEUE_PATH;

public class ContactServiceImpl implements ContactService {
    public static final String CONTRACT_FILE_PATH = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\case_study\\data\\dataservice\\contract.csv";
    Queue<Booking> queueBooking = Reader.getBookingQueue(BOOKING_QUEUE_PATH);
    TreeSet<Contract> contractSet = Reader.getContractSet(CONTRACT_FILE_PATH);

    @Override
    public void displayService() {

    }

    @Override
    public void addService(Contract contract) {
        contractSet.add(contract);
        Writer.writeContract(CONTRACT_FILE_PATH,contractSet,false);
    }

    @Override
    public void editService(Contract eId) {

    }
}
