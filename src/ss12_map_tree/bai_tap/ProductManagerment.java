package ss12_map_tree.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagerment {
    static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "HonDa", 1000));
        products.add(new Product(2, "Yamaha", 2000));
        products.add(new Product(3, "Toyota", 5000));
        products.add(new Product(4, "Suzuki", 9000));
        products.add(new Product(5, "BMW", 3000));
    }

    public static void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(input.nextLine());
        System.out.println("Enter price of product:");
        int priceProduct = Integer.parseInt(input.nextLine());
        System.out.println("Enter name of product:");
        String nameProduct = input.nextLine();
        products.add(new Product(idProduct,nameProduct,priceProduct));
        displayProduct();
    }

    public static void editProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(input.nextLine());
        System.out.println("Enter new price of product:");
        int priceProduct = Integer.parseInt(input.nextLine());
        System.out.println("Enter new name of product:");
        String nameProduct = input.nextLine();
        products.get(idProduct).setProductName(nameProduct);
        products.get(idProduct).setPrice(priceProduct);
        displayProduct();
    }

    public static void deleteProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of product:");
        int idProduct = Integer.parseInt(input.nextLine());
        products.remove(idProduct);
        displayProduct();
    }

    public static void displayProduct() {
        IdProductCompartor idProductCompartor = new IdProductCompartor();
        Collections.sort(products, idProductCompartor);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void searchProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of product ");
        String nameOfProduct = input.nextLine();
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName() == nameOfProduct) {
                index = i;
            }
        }
        System.out.println("Product after search is: " + products.get(index));
    }

    public static void sortProductByPriceDown() {
        PriceDownProductCompartor PDownCom =new PriceDownProductCompartor();
        Collections.sort(products,PDownCom);
        System.out.println("Sort by prices down:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

//    public static void sortProductByPriceUp() {
////        PriceDownProductCompartor PUpCom =new PriceDownProductCompartor();
//        Collections.sort(products);
//        System.out.println("Sort by prices down:");
//        for (Product product : products) {
//            System.out.println(product);
//        }
//    }



}
