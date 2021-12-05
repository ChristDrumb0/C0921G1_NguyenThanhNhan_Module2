package nhap.case08.util;


import nhap.case08.model.BankAccount;
import nhap.case08.model.PaymentAccount;
import nhap.case08.model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileCSV {
    public static List<String> readFromCSV(String path){
        List<String> listStr = new ArrayList<>();
        File file = new File (path);
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!= null){
                listStr.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(br !=null)
                    br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listStr;
    }

    public static List<BankAccount> getBankAccount(String path) {
        List<String> listString = readFromCSV(path);
        List<BankAccount> banking = new ArrayList<>();
        SortById sortById = new SortById();

        for (String s : listString) {
            String[] array = s.split(",");
            if(array.length == 8){
                SavingAccount saving = new SavingAccount(Integer.parseInt(array[0]), array[1], array[2], array[3],
                        Integer.parseInt(array[7]), array[5], array[6],array[7]);
                banking.add(saving);
            }else if(array.length == 6){
                PaymentAccount payment = new PaymentAccount(Integer.parseInt(array[0]), array[1], array[2], array[3],array[4],array[5]);
                banking.add(payment);
            }

        }
        Collections.sort(banking, sortById);
        return banking;
    }

}
