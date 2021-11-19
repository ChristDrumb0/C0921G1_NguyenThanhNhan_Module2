package ss16_io_text_file.bai_tap;

import java.util.Objects;

public class Moto {
    int id ;
    int capacity;
    String bikeName;

    public Moto() {
    }

    public Moto(int id, int capacity, String bikeName) {
        this.id = id;
        this.capacity = capacity;
        this.bikeName = bikeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    @Override
    public String toString() {
        return"id:" + id +
                ", capacity:" + capacity +
                ", bikeName:'" + bikeName + '\'' +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return id == moto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
