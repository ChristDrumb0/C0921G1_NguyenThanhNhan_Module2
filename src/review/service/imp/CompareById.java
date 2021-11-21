package review.service.imp;


import review.models.Candidate;

import java.util.Comparator;

public class CompareById implements Comparator<Candidate> {
    @Override
    public int compare(Candidate o1, Candidate o2) {
        return o1.candidateId.compareTo(o2.candidateId);
    }
}
