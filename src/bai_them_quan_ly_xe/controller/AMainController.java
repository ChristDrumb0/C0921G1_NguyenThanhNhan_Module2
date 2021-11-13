package bai_them_quan_ly_xe.controller;

import java.util.Scanner;

public class AMainController {
    CarController carController = new CarController();
    TruckController truckController = new TruckController();
    MotoController motorcycleController = new MotoController();
    public void Controller(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("Đăng kiểm \n"+
                    "1. Thêm mới phương tiện \n"+
                    "2. Hiển thị phương tiện \n"+
                    "3. Xóa phương tiện \n"+
                    "4. Thoát chương trình \n"+
                    "Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    while (choice!=4){
                        System.out.print("Thêm mới phương tiện \n"+
                                "1. Thêm mới xe tải\n"+
                                "2. Thêm mới xe hơi\n"+
                                "3. Thêm mới xe máy\n"+
                                "4. Trở về\n"+
                                "Nhập lựa chọn của bạn: ");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("***********************");
                                System.out.println("thêm mới xe tải");
                                truckController.addXeTai();
                                System.out.println("Đã thêm mới:");
                                truckController.displayXeTai();
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("thêm mới xe hơi");
                                carController.addXeHoi();
                                System.out.println("Đã thêm mới:");
                                carController.displayXeHoi();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                System.out.println("thêm mới xa máy");
                                motorcycleController.addXeMay();
                                System.out.println("Đã thêm mới:");
                                motorcycleController.displayXeMay();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Trở về");
                                System.out.println("***********************");
                                break;
                        }

                    }
                    break;

                case 2:
                    while (choice!=4){
                        System.out.print("Hiển thị phương tiện \n"+
                                "1. Hiển thị xe tải\n"+
                                "2. Hiển thị xe hơi\n"+
                                "3. Hiển thị xe máy\n"+
                                "4. Trở về\n"+
                                "Nhập lựa chọn của bạn: ");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Hiển thị xe tải");
                                truckController.displayXeTai();
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Hiển thị xe hƠi");
                                carController.displayXeHoi();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                System.out.println("Hiển thị xa máy");
                                motorcycleController.displayXeMay();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Trở về");
                                System.out.println("***********************");
                                break;
                        }

                    }
                    break;
                case 3:
                    while (choice!=4){
                        System.out.print("Xóa phương tiện \n"+
                                "1. Xóa xe tải\n"+
                                "2. Xóa xe hơi\n"+
                                "3. Xóa xe máy\n"+
                                "4. Trở về\n"+
                                "Nhập lựa chọn của bạn: ");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Xóa xe tải");
                                truckController.deleteXeTai();
                                System.out.println("Đã xóa:");
                                truckController.displayXeTai();
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Xóa xe hơi");
                                carController.deleteXeHoi();
                                System.out.println("Đã xóa:");
                                carController.displayXeHoi();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                System.out.println("Xóa xe máy");
                                motorcycleController.deleteXeMay();
                                System.out.println("Đã xóa:");
                                motorcycleController.displayXeMay();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Trở về");
                                System.out.println("***********************");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }
}
