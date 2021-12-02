package case_study.models;

public class Contract implements Comparable<Contract>{
    private String contractNumber;
    private int deposit;
    private int totalPayment;
    private String bookingId;
    private String customerId;

    public Contract() {

    }

    public Contract(String contractNumber, int deposit, int totalPayment, String bookingId, String customerId) {
        this.contractNumber = contractNumber;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.bookingId = bookingId;
        this.customerId = customerId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return contractNumber +
                ","+deposit +
                "," + totalPayment +
                "," + bookingId +
                "," + customerId;
    }

    @Override
    public int compareTo(Contract c) {
        return this.contractNumber.compareTo(c.contractNumber);
    }
}
