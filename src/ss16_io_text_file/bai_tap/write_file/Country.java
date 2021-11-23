package ss16_io_text_file.bai_tap.write_file;

public class Country {
    private int id ;
    private String code;
    private String countryName;

    public Country() {
    }

    public Country(int id, String code, String countryName) {
        this.id = id;
        this.code = code;
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", code: '" + code + '\'' +
                ", countryName: '" + countryName + '\'' +
                '.';
    }
}
