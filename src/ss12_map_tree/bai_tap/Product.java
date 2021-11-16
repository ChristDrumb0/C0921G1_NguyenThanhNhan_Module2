package ss12_map_tree.bai_tap;

public class Product {
    int id;
    String productName;
    int price;

    public Product() {
    }

    public Product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", Sản phẩm: '" + productName +
                ", giá: " + price +
                '.';
    }
}
