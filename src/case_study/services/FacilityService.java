package case_study.services;

import case_study.models.FRoom;
import case_study.models.Facility;

public interface FacilityService extends Service<Facility> {
    void displayMaintenance();
    void addRoom(Facility facility);
    void addVilla(Facility facility);
    void addHouse(Facility facility);
}
