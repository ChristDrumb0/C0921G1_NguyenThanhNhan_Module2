package case_study.services;

import case_study.models.Facility;

public interface FacilityService extends Service<Facility> {
    void addRoom();
    void addVilla();
    void addHouse();
}
