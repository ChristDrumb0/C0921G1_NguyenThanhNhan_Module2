package case_study.utils;

import case_study.models.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Writer {
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

    public static void writeEmployeeToCSV(String path, List<PEmployee> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (PEmployee employee : employeeList) {
            stringList.add(employee.toString());
        }
        writeToCSV(path, stringList, append);
    }

    public static void writeCustomerToCSV(String path, List<PCustomer> customersList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (PCustomer customer : customersList) {
            stringList.add(customer.toString());
        }
        writeToCSV(path, stringList, append);
    }

    public static void writeFacilityToCSV(String path, Map<? super Facility, Integer> facilityMap, boolean append) {
        List<String> stringList = new ArrayList<>();

        for (Map.Entry<? super Facility, Integer> facility : facilityMap.entrySet()) {

            stringList.add( facility.getKey() + "," + facility.getValue());

        }
        writeToCSV(path, stringList, append);
    }

    public static void writeBookingTree(String path, TreeSet<Booking> bookingTreeSet, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingTreeSet) {
            stringList.add(booking.toString());
        }
        writeToCSV(path, stringList, append);
    }
    public static void writeBookingQueue(String path, Queue<Booking> bookingQueue, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingQueue) {
            stringList.add(booking.toString());
        }
        writeToCSV(path, stringList, append);
    }

    public static void writeContract(String path, TreeSet<Contract> contractS, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractS) {
            stringList.add(contract.toString());
        }
        writeToCSV(path, stringList, append);
    }


}
