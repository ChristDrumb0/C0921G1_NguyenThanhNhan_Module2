package nhap.case08.util;

import case_study.models.PEmployee;
import nhap.case08.model.BankAccount;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteFileCSV {

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

    public static void writeAccountToCSV(String path, List<BankAccount> bankList, boolean append) {
        List<String> stringList = new ArrayList<>();
        SortById sortById = new SortById();
        Collections.sort(bankList, sortById);
        for (BankAccount bank : bankList) {
            stringList.add(bank.toString());
        }


        writeToCSV(path, stringList, append);
    }
}
