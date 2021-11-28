package case_study.services.Impl;

import case_study.models.PEmployee;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<PEmployee> {
    @Override
    public int compare(PEmployee o1, PEmployee o2) {

        return o1.getEmployeeId().compareTo(o2.getEmployeeId());
    }

}
