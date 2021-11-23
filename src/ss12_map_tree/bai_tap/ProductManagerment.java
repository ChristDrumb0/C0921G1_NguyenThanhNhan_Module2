package ss12_map_tree.bai_tap;


//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;

public class ProductManagerment {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    {
        products.add(new Product(1, "iPhone 13", 1000));
        products.add(new Product(2, "iPhone 13 pro max", 2000));
        products.add(new Product(3, "iPhone 13 pro", 1500));
        products.add(new Product(4, "iPhone 13 pro max diamond", 6000));
        products.add(new Product(5, "iPhone 13 mini", 750));
    }

    public void addProduct() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of product:");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter price of product:");
        int priceProduct = Integer.parseInt(scanner.nextLine());

        products.add(new Product(idProduct,nameProduct,priceProduct));
        displayProduct();
    }

    public void editProduct() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new name of product:");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter new price of product:");
        int priceProduct = Integer.parseInt(scanner.nextLine());

        products.get(idProduct-1).setProductName(nameProduct);
        products.get(idProduct-1).setPrice(priceProduct);
        displayProduct();
    }

    public void deleteProduct() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int id= Integer.parseInt(scanner.nextLine());
        products.remove(id-1);

//        products.removeIf(element -> element.getId() == id);
        displayProduct();

    }

    public void displayProduct() {
        IdProductCompartor idProductCompartor = new IdProductCompartor();
        Collections.sort(products, idProductCompartor);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProduct() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of product ");
        String nameOfProduct = scanner.nextLine();
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName() == nameOfProduct) {
                index = i;
            }
        }
        System.out.println("Product after search is: " + products.get(index));
    }

    public void priceDown() {
        PriceDownProductCompartor PDownCom =new PriceDownProductCompartor();
        Collections.sort(products,PDownCom);
        System.out.println("Sort by prices down:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void priceUp() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2){
//                return o1.price.compareTo(o2.price);
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        System.out.println("Sort by prices Up:");
        for (Product product : products) {
            System.out.println(product);
        }
    }



}
