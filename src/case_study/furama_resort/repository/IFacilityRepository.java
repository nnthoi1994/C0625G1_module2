package case_study.furama_resort.repository;

import case_study.furama_resort.model.Facility;

import java.util.Map;

public interface IFacilityRepository extends IRepository {
    Map<Facility, Integer> getAllFacilities();
    void add(Facility facility);
    Map<Facility, Integer> getMaintenanceFacilities();

}
