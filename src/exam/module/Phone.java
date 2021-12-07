package exam.module;

import java.util.Objects;

public abstract class Phone {
    String type;
    int id;
    String phoneName;
    String price;
    int quantity;
    String manufacturer;

    public Phone() {
    }

    public Phone(String type, int id, String phoneName, String price, int quantity, String manufacturer) {
        this.type= type;
        this.id = id;
        this.phoneName = phoneName;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return type +
                "," + id +
                "," + phoneName +
                "," + price +
                "," + quantity +
                "," + manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
