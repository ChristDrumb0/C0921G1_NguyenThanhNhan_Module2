package case_study.services.Impl;

import case_study.utils.Reader;
import case_study.utils.Writer;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.services.ContractService;

import java.util.Queue;
import java.util.TreeSet;

import static case_study.services.Impl.BookingServiceImpl.BOOKING_QUEUE_PATH;

public class ContractServiceImpl implements ContractService {
    public static final String CONTRACT_FILE_PATH = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\case_study\\data\\dataservice\\contract.csv";
    Queue<Booking> queueBooking = Reader.getBookingQueue(BOOKING_QUEUE_PATH);
    TreeSet<Contract> contractSet = Reader.getContractSet(CONTRACT_FILE_PATH);

    public Queue<Booking> getQueueBooking() {
        return queueBooking;
    }

    public void setQueueBooking(Queue<Booking> queueBooking) {
        this.queueBooking = queueBooking;
    }

    public TreeSet<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(TreeSet<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    @Override
    public void displayService() {
        for (Contract contract : contractSet) {
            System.out.println(contract);
        }
    }

    @Override
    public void addService(Contract contract) {
        contractSet.add(contract);
        Writer.writeContract(CONTRACT_FILE_PATH,contractSet,true);
    }

    @Override
    public void editService(Contract e) {
        Writer.writeContract(CONTRACT_FILE_PATH,contractSet,false);
    }
}
