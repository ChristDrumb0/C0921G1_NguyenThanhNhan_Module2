package exam.util;

import exam.module.Phone;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class WriterFile {
    private static void writeToCSV(String path, List<String> list, boolean append) {
        File file = new File(path);
        FileWriter fWr = null;
        BufferedWriter bWr = null;
        try {
            fWr = new FileWriter(file, append);
            bWr = new BufferedWriter(fWr);
            for (String line : list) {
                bWr.write(line);
                bWr.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bWr != null) {
                    bWr.close();
                    fWr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writePhoneToCSV(String path, List<Phone> phoneList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Phone phone : phoneList) {
            stringList.add(phone.toString());
        }

        writeToCSV(path, stringList, append);
    }
}
