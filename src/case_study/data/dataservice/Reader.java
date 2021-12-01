package case_study.data.dataservice;

import case_study.models.*;

import java.io.*;
import java.util.*;

public class Reader {
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

    public static List<PEmployee> getEmployee(String path) {

        List<String> listString = readFromCSV(path);
        List<PEmployee> employeeList = new ArrayList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            PEmployee employee = new PEmployee(array[0], array[1], array[2], array[3],
                    array[4], array[5], array[6], getStudyLevel(array[7]), getPosition(array[8]), Integer.parseInt(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }
    public static int getPosition(String str) {
        //    = {"Reception","Waiter", "Executive", "Supervisors", "Managers", "Directors"};
        switch (str){
            case "Reception":
                return 1;
            case "Waiter":
                return 2;
            case "Executive":
                return 3;
            case "Supervisors":
                return 4;
            case "Managers":
                return 5;
            case "Directors":
                return 6;
            default:
                return 0;
        }
    }
    public static int getStudyLevel(String str) {
        switch (str){
            case "Intermediate":
                return 1;
            case "College":
                return 2;
            case "University":
                return 3;
            case "Post Graduated":
                return 4;
            default:
                return 0;
        }

    }

    public static List<PCustomer> getCustomer(String path) {
        List<String> listString = readFromCSV(path);
        List<PCustomer> customerList = new LinkedList<>();
        for (String s : listString) {
            String[] array = s.split(",");
            PCustomer customer = new PCustomer(array[0], array[1], array[2], array[3],
                    array[4], array[5], array[6], getType(array[7]), array[8]);
            customerList.add(customer);
        }
        return customerList;
    }
    public static int getType(String str){

            switch (str){
                case "Member":
                    return 1;
                case "Silver":
                    return 2;
                case "Gold":
                    return 3;
                case "Platinum":
                    return 4;
                case "Diamond":
                    return 5;
                default:
                    return 0;
            }

    }

    public static Map<Facility,Integer> getFacility(String path){
        List<String> listString = readFromCSV(path);
        Map<Facility,Integer> facility = new LinkedHashMap<>();
        for (String str : listString) {
            String[] array = str.split(",");
            if (array[0].equals("Villa")) {
                Facility villa = new FVilla(array[1], array[2], Double.parseDouble(array[3]), Double.parseDouble(array[4]),
                        Integer.parseInt(array[5]), array[6], array[7],
                        Double.parseDouble(array[8]), Integer.parseInt(array[9]));
                facility.put(villa, Integer.parseInt(array[10]));
            }
            if (array[0].equals("House")) {
                Facility house = new FHouse(array[1], array[2], Double.parseDouble(array[3]), Integer.parseInt(array[4]),
                        Integer.parseInt(array[5]), array[6], array[7],
                        Integer.parseInt(array[8]));
                facility.put(house, Integer.parseInt(array[9]));
            }
            if (array[0].equals("Room")) {
                Facility room = new FRoom(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6]);
                facility.put(room, Integer.parseInt(array[7]));
            }
        }
        return facility;

    }
}
