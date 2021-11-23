package ss16_io_text_file.thuc_hanh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    public static final String COMMA = ",";
    public static final String FILE_PATH = "C:\\Users\\ASUS\\Desktop\\CodeGym\\C0921G1_NguyenThanhNhan\\Module 2\\bai_tap\\C0921G1_NguyenThanhNhan_Module2\\src\\ss16_io_text_file\\thuc_hanh\\hocsinh.csv";

    public static void writeCSV(Student student) {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.getId() + COMMA + student.getName() + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        writeCSV(new Student(1, "Hoa"));
        writeCSV(new Student(2, "Hung"));
    }
}
