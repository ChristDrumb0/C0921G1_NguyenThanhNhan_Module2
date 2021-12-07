package exam.module;

public class ImportPhone extends Phone{
    String importFrom;
    String status;

    public ImportPhone() {
    }

    public ImportPhone(String type, int id, String phoneName, String price, int quantity, String manufacturer, String importFrom, String status) {
        super(type, id, phoneName, price, quantity, manufacturer);
        this.importFrom = importFrom;
        this.status = status;
    }

    public String getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(String importFrom) {
        this.importFrom = importFrom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + importFrom +
                "," + status;
    }
}
