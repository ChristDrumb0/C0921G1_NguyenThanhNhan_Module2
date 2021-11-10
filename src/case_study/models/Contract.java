package case_study.models;

public class Contract extends Booking{
    private String contractNumber;
    private int deposit;
    private int totalPayment;


    public Contract() {

    }

    public Contract(String bookingId, String contractNumber, int deposit, int totalPayment) {
        super(bookingId);
        this.contractNumber = contractNumber;
        this.deposit = deposit;
        this.totalPayment = totalPayment;

    }

    public static void main(String[] args) {
        Contract contract = new Contract();
        System.out.println(contract.getCustomerId());

    }
}
