package ss17_io_binary_file_serialization.bai_tap;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductService {
//    ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Set<Product> products = new HashSet<>();
    {
//        products.add(new Product(1, "iPhone 13", "Apple", 1000,"tầm trung"));
//        products.add(new Product(2, "iPhone 13 pro max","Apple", 2000,"cao cấp"));
//        products.add(new Product(3, "iPhone 13 pro","Apple", 1500,"cận cao cấp"));
//        products.add(new Product(4, "iPhone 13 pro max diamond","Apple", 6000,"siêu cấp"));
//        products.add(new Product(5, "iPhone 13 mini","Apple", 750 ,"giá rẻ"));
        products = FileService.readFile();
    }
    public void addProduct(){
        System.out.println("Enter id of product:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of product:");
        String name = scanner.nextLine();
        System.out.println("Enter name of manufacturer:");
        String nameM = scanner.nextLine();
        System.out.println("Enter price of product:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter notes for product:");
        String note = scanner.nextLine();
        products.add(new Product(id,name,nameM,price,note));
        System.out.println("Đã thêm thành công:");
        FileService.writeFile(products);
        displayProduct();
    }
    public void deleteProduct(){
        System.out.println("Enter id of product:");
        int id = Integer.parseInt(scanner.nextLine());
        products.removeIf(element -> element.getId() == id);
        displayProduct();
    }
    public void editProduct(){
        System.out.println("Bảo trì");
    }
    public void displayProduct(){
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void searchProduct(){
        System.out.println("Nhập id cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (product.getId() == id){
                System.out.println(product);
            }
            else {
                System.out.println("Không tìm thấy");
            }

        }
    }
}
