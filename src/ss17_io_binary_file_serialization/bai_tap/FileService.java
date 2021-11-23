package ss17_io_binary_file_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileService {

    public static final String FILE_PATH = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\ss17_io_binary_file_serialization\\bai_tap\\file_product.txt";

//    public static List<Product> readFile(){
    public static Set<Product> readFile(){
        File file = new File(FILE_PATH);
//        List<Product> products = new ArrayList<>();
        Set<Product> products = new HashSet<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(file);
            if(fis.available()!=0){
                ois = new ObjectInputStream(fis);
//                products = (List<Product>) ois.readObject();
                products = (Set<Product>) ois.readObject();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try{
                if(ois!=null){
                    ois.close();
                }
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return products;
    }
//    public static void writeFile(List<Product> products){
    public static void writeFile(Set<Product> products){
        File file = new File(FILE_PATH);
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try{
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null){
                    oos.close();
                }
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
