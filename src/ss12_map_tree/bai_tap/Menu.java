package ss12_map_tree.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagerment pM = new ProductManagerment();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Display Product list");
            System.out.println("5. Find Product by name");
            System.out.println("6. Sort Product by price up");
            System.out.println("7. Sort Product by price down");
            System.out.println("0. Exit Menu");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    pM.addProduct();
                    break;
                case 2:
                    pM.deleteProduct();
                    break;
                case 3:
                    pM.editProduct();
                    break;
                case 4:
                    pM.displayProduct();
                    break;
                case 5:
                    pM.searchProduct();
                    break;
                case 6:
                    pM.priceUp();
//                    System.out.println("Bảo trì");
                    break;
                case 7:
                    pM.priceDown();
                    break;
                default:
                    System.out.println("Please enter again !");
                    break;
            }
        }
    }
}
