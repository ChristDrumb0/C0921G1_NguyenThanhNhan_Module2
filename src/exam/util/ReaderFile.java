package exam.util;

import exam.module.ImportPhone;
import exam.module.LegitPhone;
import exam.module.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderFile {
    public static List<String> readFromCSV(String path) {
        List<String> listStr = new ArrayList<>();
        File file = new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                listStr.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listStr;
    }


    public static List<Phone> getPhone(String path) {
        List<String> listString = readFromCSV(path);
        List<Phone> phone = new ArrayList<>();

        for (String s : listString) {
            String[] array = s.split(",");
            if(array[0].equals("import phone")) {
                ImportPhone iP = new ImportPhone(array[0], Integer.parseInt(array[1]), array[2], array[3], Integer.parseInt(array[4]),
                        array[5], array[6], array[7]);
                phone.add(iP);

            }else if(array[0].equals("legit phone")){
                LegitPhone lP = new LegitPhone(array[0], Integer.parseInt(array[1]), array[2], array[3], Integer.parseInt(array[4]),
                        array[5], array[6], array[7]);
                phone.add(lP);
            }

        }
        return phone;

    }

}
