package case_study.furama_resort.service;

import case_study.furama_resort.model.Facility;

public interface IFacilityService extends Service{
    void display();
    void add(Facility facility);
    void displayMaintenance();

}
