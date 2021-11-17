package ss11_dsa_stack_queue.bai_tap.demerging;

import java.time.LocalDate;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        ArrayList<Data> dataList = new ArrayList<>();
        dataList.add(new Data("Nguyen Van A", true, LocalDate.of(2000, 2, 25)));
        dataList.add(new Data("Nguyen Van B", true, LocalDate.of(2005, 4, 5)));
        dataList.add(new Data("Nguyen Thi A", false, LocalDate.of(2008, 3, 10)));
        dataList.add(new Data("Nguyen Thi B", false, LocalDate.of(2001, 5, 20)));
        dataList.add(new Data("Nguyen Thi C", false, LocalDate.of(2000, 5, 20)));
        dataList.add(new Data("Nguyen Thi D", false, LocalDate.of(2009, 5, 20)));
//        Comparator compareDOB = new DataComparator();
        Collections.sort(dataList, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.dayOfBirth.compareTo(o2.dayOfBirth);
            }
        });
        Queue<Data> nu = new LinkedList<>();
        Queue<Data> nam = new LinkedList<>();
        Queue<Data> outPut = new LinkedList<>();

        for (Data input : dataList) {
            if (input.isMale()) {
                nam.add(input);
            } else nu.add(input);
        }
        while (!nu.isEmpty()) {
            outPut.add(nu.poll());
        }
        while (!nam.isEmpty()) {
            outPut.add(nam.poll());
        }
        while (!outPut.isEmpty()) {
            System.out.println(outPut.remove());
        }

    }

}
