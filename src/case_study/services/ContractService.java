package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.Queue;
import java.util.TreeSet;

public interface ContractService extends Service<Contract> {
    public TreeSet<Contract> getContractSet();
    public Queue<Booking> getQueueBooking();
}
