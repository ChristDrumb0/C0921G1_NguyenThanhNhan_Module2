package ss16_io_text_file.bai_tap.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MotoReader {
    private static final String PATH_SOURCE_FILE = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\ss16_io_text_file\\bai_tap\\data.csv";
    public static final String PATH_TARGET_FILE = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\ss16_io_text_file\\bai_tap\\catalog.csv";

    private static String readData(FileReader fileReader) {
        int i = 0;
        String result = "";

        try {
            while ((i = fileReader.read()) != -1){
                result += (char) i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private static void writeData(FileWriter fileWriter, String moto){
        try{
            fileWriter.write(moto);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String result = "";
        File fileSource = new File(PATH_SOURCE_FILE);
        File fileTarget = new File(PATH_TARGET_FILE);
        try {
            FileReader fileReader = new FileReader(fileSource);
            FileWriter fileWriter = new FileWriter(fileTarget);
            result = readData(fileReader);
            writeData(fileWriter, result);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
