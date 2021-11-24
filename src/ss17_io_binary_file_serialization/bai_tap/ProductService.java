package ss17_io_binary_file_serialization.bai_tap;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductService {
//    ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Set<Product> products = new HashSet<>();
//    Map<Product> products = new HashMap<>();
    {
//        products.add(new Product(1, "iPhone 13", "Apple", 1000,"tầm trung"));
//        products.add(new Product(2, "iPhone 13 pro max","Apple", 2000,"cao cấp"));
//        products.add(new Product(3, "iPhone 13 pro","Apple", 1500,"cận cao cấp"));
//        products.add(new Product(4, "iPhone 13 pro max diamond","Apple", 6000,"siêu cấp"));
//        products.add(new Product(5, "iPhone 13 mini","Apple", 750 ,"giá rẻ"));
        products = FileService.readFile();
    }
    public void saveFile(){
        FileService.writeFile(products);
        products = FileService.readFile();
        for (Product product : products) {
            System.out.println(product);
        }
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
        Product element = new Product(id,name,nameM,price,note);
        String yes = null;
        if(products.contains(element)){
            System.out.println("Already had the product, do you want to update (Y/N)");
            yes = scanner.nextLine();
            if (yes.equals("y")||yes.equals("Y")){
                products.remove(element);
                products.add(element);
                System.out.println("updated");
            }

        }else{
            products.add(element);
            System.out.println("successfully added");
        }
        displayProduct();
    }
    public void deleteProduct(){
        System.out.println("Enter id of product:");
        int id = Integer.parseInt(scanner.nextLine());
        products.removeIf(element -> element.getId() == id);
        displayProduct();
    }
    public void editProduct(){
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
        Product element = new Product(id,name,nameM,price,note);
        String yes = null;
        if(!products.contains(element)){
            System.out.println("Dont had the product yet, do you want to add new (Y/N)");
            yes = scanner.nextLine();
            if (yes.equals("y")||yes.equals("Y")){
                products.add(element);
            }

        }else{
            products.remove(element);
            products.add(element);
            System.out.println("successfully added");
        }
        displayProduct();
        System.out.println(yes);
    }
    public void displayProduct(){
//        products = FileService.readFile();
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
