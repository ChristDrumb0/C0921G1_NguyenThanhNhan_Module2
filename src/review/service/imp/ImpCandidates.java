package review.service.imp;

import review.models.Candidate;
import review.models.Experienced;
import review.models.Fresher;
import review.models.Internship;
import review.service.ExpertService;
import review.service.FresherService;
import review.service.InternService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.binarySearch;

public class ImpCandidates implements ExpertService , FresherService , InternService {
    ArrayList<Candidate> candidates = new ArrayList<>();
    {
       candidates.add(new Experienced("EXP001","Aelbrecht","Stefan",1990,"199 Boluva st.","0505647299","Stefan@gmail.com",0,5,"Art direction"));
       candidates.add(new Fresher("FRE001","Barbosa","De Souza",2000,"199 st.","0883225275","Souza@gmail.com",1,2019,2,"University of Cambridge"));
       candidates.add(new Internship("INT001","Maria","Madeleine",2003,"24 Jump st.","0683355934","Madeleine@gmail.com",2,"Bachelor's of Art","3rd year","University of Yale"));
    }


    @Override
    public void addExpert(Experienced expert) {
        candidates.add(expert);
    }

    @Override
    public void addFresher(Fresher fresher) {
        candidates.add(fresher);
    }

    @Override
    public void addIntern(Internship intern) {
        candidates.add(intern);
    }

    public void displayCandidates(){
        Collections.sort(candidates,new CompareById());
        for (Candidate can : candidates) {
            System.out.println(can);
        }
    }

    public String searchCans(String canId){
//        Collections.sort(candidates,new CompareById());
        for (Candidate cans :candidates) {
            if(cans.getCandidateId().equals(canId)){
                return cans.toString();
            }

        }
        return "unavailable";

    }

//    public static void main(String[] args) {
//        ImpCandidates candidates = new ImpCandidates();
//        candidates.displayCandidates();
//    }

//    @Override
//    public void deleteExpert() {
//    }
//    @Override
//    public void displayExpert(String canId)
//    }

//    @Override
//    public void deleteFresher() {
//    }
//    @Override
//    public void editFresher(String canId) {
//    }

//    @Override
//    public void deleteIntern() {
//    }
//    @Override
//    public void editIntern(String canId) {
//    }
}
